public class InverterString {
    public static void main(String[] args) {
        String entrada = "Exemplo de string para inverter";
        String invertida = inverterString(entrada);
        System.out.println("String original: " + entrada);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int tamanho = caracteres.length;
        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - 1 - i];
            caracteres[tamanho - 1 - i] = temp;
        }
        return new String(caracteres);
    }
}