public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxLength=0;
        int count = 0;
        int end = 0;
        while(sc.hasNext()){
            String str = sc.nextLine();
            for(int i = 0;i < str.length();i++){
                if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                    count++;
                    if(count > maxLength){
                        end = i;
                        maxLength = count;
                    }
                } else{
                    count = 0;
                }
            }
            System.out.println(str.substring(end - maxLength + 1,end + 1));
        }
    }