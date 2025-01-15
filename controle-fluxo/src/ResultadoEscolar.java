public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 4; 

        //String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        String result = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(result);

        /*
        if(nota >= 7)
        {
            System.out.println("Aprovado");
        }else if(nota >= 5 && nota < 7)
        {
            System.out.println("Prova de Recuperação");
        }else
        {
            System.out.println("Reprovado");
        }
        */
    }
}
