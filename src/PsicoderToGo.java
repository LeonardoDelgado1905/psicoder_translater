public class PsicoderToGo extends PsicoderBaseListener{

    int nested_level = 0;
    boolean inicio = false;
    public void printTabs(){
        for(int i = 0; i < nested_level; ++i){
            System.out.print("\t");
        }
    }

    @Override
    public void enterStart(PsicoderParser.StartContext ctx) {
        System.out.println("package main");
        System.out.println("import(\n" +
                "   fmt\n" +
                ")");
    }

    @Override
    public void enterMain(PsicoderParser.MainContext ctx) {
        System.out.println("func main() {\n");
        nested_level++;
    }

    @Override
    public void exitMain(PsicoderParser.MainContext ctx) {
        System.out.println("}");
    }


}

