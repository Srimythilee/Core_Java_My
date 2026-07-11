class Main {
    public static void main(String[] args) {
        String inputname = "Mythili";
        String outputname = "";

        for (int i = inputname.length() - 1; i >= 0; i--) {
            outputname = outputname + inputname.charAt(i);
        }

        System.out.println(outputname);
    }
}