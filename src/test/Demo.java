package test;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.ComThread;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

public class Demo {
	private static final Integer WORD_TO_PDF_OPERAND = 17;
    private static final Integer PPT_TO_PDF_OPERAND = 32;
    private static final Integer EXCEL_TO_PDF_OPERAND = 0;
    
    public static void doc2pdf(String srcFilePath, String pdfFilePath) throws Exception { 
    	
    	//srcFilePath="D:\\IEdownload\\word\\ssss.docx";
    	//pdfFilePath="D:\\IEdownload\\word\\1.pdf";
        ActiveXComponent app = null;  
        Dispatch doc = null;  
        try {  
            ComThread.InitSTA();  
            app = new ActiveXComponent("Word.Application");  
            app.setProperty("Visible", false);  
            Dispatch docs = app.getProperty("Documents").toDispatch(); 
            Object[] obj = new Object[]{
                    srcFilePath, 
                    new Variant(false),  
                    new Variant(false),//�Ƿ�ֻ��  
                    new Variant(false),   
                    new Variant("pwd")
            };
            doc = Dispatch.invoke(docs, "Open", Dispatch.Method, obj, new int[1]).toDispatch();  
//          Dispatch.put(doc, "Compatibility", false);  //�����Լ��,Ϊ�ض�ֵfalse����ȷ  
            Dispatch.put(doc, "RemovePersonalInformation", false);  
            Dispatch.call(doc, "ExportAsFixedFormat", pdfFilePath, WORD_TO_PDF_OPERAND); // word����Ϊpdf��ʽ�ֵ꣬Ϊ17  
  
        }catch (Exception e) {  
            e.printStackTrace();
            throw e;
        } finally {  
            if (doc != null) {  
                Dispatch.call(doc, "Close", false);  
            }  
            if (app != null) {  
                app.invoke("Quit", 0);  
            }  
            ComThread.Release();  
        }  
    }  
    
    public void ppt2pdf(String srcFilePath, String pdfFilePath) throws Exception {
        ActiveXComponent app = null;
        Dispatch ppt = null;
        try {
            ComThread.InitSTA();
            app = new ActiveXComponent("PowerPoint.Application");
            Dispatch ppts = app.getProperty("Presentations").toDispatch();

            /*
             * call 
             * param 4: ReadOnly
             * param 5: Untitledָ���ļ��Ƿ��б���
             * param 6: WithWindowָ���ļ��Ƿ�ɼ�
             * */
            ppt = Dispatch.call(ppts, "Open", srcFilePath, true,true, false).toDispatch();
            Dispatch.call(ppt, "SaveAs", pdfFilePath, PPT_TO_PDF_OPERAND); // ppSaveAsPDFΪ�ض�ֵ32

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (ppt != null) {
                Dispatch.call(ppt, "Close");
            }
            if (app != null) {
                app.invoke("Quit");
            }
            ComThread.Release();
        }
    }
    
    public void excel2Pdf(String inFilePath, String outFilePath) throws Exception {
        ActiveXComponent ax = null;
        Dispatch excel = null;
        try {
            ComThread.InitSTA();
            ax = new ActiveXComponent("Excel.Application");
            ax.setProperty("Visible", new Variant(false));
            ax.setProperty("AutomationSecurity", new Variant(3)); // ���ú�
            Dispatch excels = ax.getProperty("Workbooks").toDispatch();

            Object[] obj = new Object[]{ 
                    inFilePath, 
                    new Variant(false),
                    new Variant(false) 
             };
            excel = Dispatch.invoke(excels, "Open", Dispatch.Method, obj, new int[9]).toDispatch();
            
            // ת����ʽ
            Object[] obj2 = new Object[]{ 
                    new Variant(EXCEL_TO_PDF_OPERAND), // PDF��ʽ=0
                    outFilePath, 
                    new Variant(0)  //0=��׼ (���ɵ�PDFͼƬ�����ģ��) ; 1=��С�ļ�
            };
            Dispatch.invoke(excel, "ExportAsFixedFormat", Dispatch.Method,obj2, new int[1]);

        } catch (Exception es) {
            es.printStackTrace();
            throw es;
        } finally {
            if (excel != null) {
                Dispatch.call(excel, "Close", new Variant(false));
            }
            if (ax != null) {
                ax.invoke("Quit", new Variant[] {});
                ax = null;
            }
            ComThread.Release();
        }

    }
    
    public static void main(String[] args) throws Exception {
        String path = "C:/Users/johnny/Desktop/�ĵ�/20170427/test/001/";
        new Demo().doc2pdf(path + "1.docx", path+ "1.pdf");
//      new Demo().doc2pdf(path + "1.docx", path+ "1x.pdf");
        System.out.println("ת���ɹ���");
        
        
    }
}
