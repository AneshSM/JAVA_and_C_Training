class Days{
    public static void main(String []args){
        String a;
        int m;
         a="jan";
        // if(i= a=="jan"?1:a=="march"?1:a=="may"?1:a=="july"?1:a=="aug"?1:a=="oct"?1:a=="dec"?1:0){
        //     System.out.println("31 Days");
        // }
        // else{
        //     System.out.println("30 Days");
        // }
        switch (a) {
            case "feb":
            System.out.println("28 or 29 Days");
            break;
            case "jan":
            case "mar":
            case "may":
            case "july":
            case "agu":
            case "oct":
            case "dec":
             System.out.println("31 Days");
             break;
            case "apr":
            case "jun":
            case "sep":
            case "nov":
            System.out.println("30 Days");
             break;
            default:System.out.println("Invalid choice");
        }
    }
}