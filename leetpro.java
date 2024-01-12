class leetpro{
    public int[] plusOne(int[] digits) {
        int num=0;
        for(int i=0;i<digits.length;i++){
            num=num*10+digits[i];
        }
        num++;
        int arr[]=new int[digits.length+1];
        for(int i=0;i<arr.length;i++){
            arr[arr.length-1-i]=num%10;
            num/=10;
        }
        
        return arr;
    }
}
