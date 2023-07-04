class FaxMachine implements Printer {
    public void print(String document) {
        System.out.println("Sending document via fax: " + document);
    }
}
