
int sum(int m, int n);

int sum(int m,int n){
    int sum,m,n;
    sum = m + n;
    return sum;
}

int main()
{    
    int m, n;

    scanf("%d %d", &m, &n);
    printf("sum = %d\n", sum(m, n));
    
    return 0;
}