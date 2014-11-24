class StringToFloat
{
    public static void main(String[] args)
    {

	if(args.length != 1 || (args[0].length() != 32) || !args[0].matches("[01]{32}"))
        {
            System.out.println("usage: javac StringToFloat x\n - x has the format: 1 bit for Negation, 8 bit for the Exponent and 23 bit mantisse");
            System.exit(1);
        }
        String str = args[0];


        char[] chars = args[0].toCharArray();
        int s = (str.charAt(0) == '1') ? -1 : 1;
        //Boolean s = (str.charAt(0) == '1');
        for (int i = 1; i < 8; i++)
        {
            System.out.print(str.charAt(i));
        }

        System.out.println();

    }
}

