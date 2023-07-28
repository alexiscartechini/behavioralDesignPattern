public class DocumentViewer {

  private static TextDocument textDocument = new TextDocument();

  public static void main(String[] args) {
    textDocument.write("hello");
    textDocument.print();
    textDocument.save();
    textDocument.write(" world");
    textDocument.print();
    textDocument.undo();
    textDocument.print();
  }

}
