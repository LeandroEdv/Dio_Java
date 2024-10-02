public class ConversaoString {
    public static void main(String[] args) {
        String input = "130,134,132,130,130,136";
        String[]velocidades = input.split(",");
        int soma =0;

        for (String v: velocidades){
            soma += Double.parseDouble(v);

        }
        double result = (double) soma /velocidades.length;
        System.out.println(result);
    }


}
