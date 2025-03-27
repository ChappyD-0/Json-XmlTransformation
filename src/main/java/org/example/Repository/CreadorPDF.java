package org.example.Repository;
/*
 * -----------------------------------
 *  Proyecto: JsonTranfer
 *  Autor: chappyd-0
 *  Fecha: 3/20/25
 * -----------------------------------
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class CreadorPDF {

    public void crearNuevoArchivo(String nombreArchivo, String texto) {
        try {
            // Crear el documento
            Document documento = new Document();
            // Asociar el PdfWriter al documento y especificar la ruta de salida
            PdfWriter.getInstance(documento, new FileOutputStream("ejemplo_iText5.pdf"));
            documento.open();
            // Agregar contenido (un párrafo)
            documento.add(new Paragraph(texto));
            documento.close();
            System.out.println("PDF creado exitosamente con iText 5");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
