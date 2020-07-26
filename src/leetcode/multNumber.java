package leetcode;

public class multNumber{
    public String multiply(String num1, String num2) {
        int n1=num1.length();
        int n2=num2.length();
        int[] res=new int[n1+n2];
        for(int i=n2-1;i>=0;i--){
            for(int j=n1-1;j>=0;j--){
                int temp=(res[i+j+1]-'0')+(num1.charAt(j)-'0')*(num2.charAt(i)-'0');
                res[i+j+1]=temp%10+'0';//当前位
                res[i+j]+=temp/10; //前一位加上进位，res[i+j]已经初始化为'0'，加上int类型自动转化为char，所以此处不加'0'
            }
        }

      //去除首位'0'
      /*  for(int i=0;i<n1+n2;i++){
            if(res[i]!='0')
                return res.substr(i);
        }*/
        return "0";


    }
};

      /*作者：carryzz
        链接：https://leetcode-cn.com/problems/multiply-strings/solution/c-shu-shi-cheng-fa-dai-ma-jian-ji-you-ya-yi-dong-b/
        来源：力扣（LeetCode）
        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
