pulbic class AllInOnePrinter implements Printer, Faxer, Scanner {

    @Override
    public void print() {
        System.out.println("Printando");
    }

    @Override
    public void scan() {
        //Implementando mêtodo scan
    }

    @Override
    public void fax() {
       //Implementando mêtodo fax
    }


}