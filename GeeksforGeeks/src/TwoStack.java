
/**
 * @author ssm
 *
 */
class TwoStack
{

	int size;
	int top1,top2;
	int arr[] = new int[100];

	TwoStack()
	{
		size = 100;
		top1 = -1;
		top2 = size;
	}
}

class GfG
{
    // sq is the object of class TwoStack

    /* The method push to push element into the stack 2 */
    void push1(int x, TwoStack sq)
    {
        if(sq.top1 < sq.top2-1){
            sq.top1++;
            sq.arr[sq.top1] = x;   
        }
        else{
            System.out.println("overflow");
        }
    }

    /* The method push to push element into the stack 2*/
    void push2(int x, TwoStack sq)
    {
        if(sq.top1 < sq.top2-1){
            sq.top2--;
            sq.arr[sq.top2] = x;
        }
        else{
            System.out.println("overflow");
        }
    }

    /* The method pop to pop element from the stack 1 */
    int pop1(TwoStack sq)
    {
        int ret = 0;
        if(sq.top1 >= 0){
            ret = sq.arr[sq.top1];
            sq.top1--;
        }
        else{
            ret = -1;
        }
        return ret;
    }

    /* The method pop to pop element from the stack 2 */
    int pop2(TwoStack sq)
    {
        int ret = 0;
        if(sq.top2 < sq.size){
            ret = sq.arr[sq.top2];
            sq.top2++;
        }
        else{
            ret = -1;
        }
        return ret;
    }
}
