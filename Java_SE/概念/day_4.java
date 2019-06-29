已知二叉树A(B(,D(F,H)),C(,E(G(I)))),由此二叉树转换的森林描述正确的是（   b,d   ）
a.该森林包含两棵树
b.该森林包含三棵树
c.以A为根的树有两个孩子
d.以A为根的树有三个孩子

https://www.nowcoder.com/test/question/done?tid=24723625&qid=372730#summary

https://www.cnblogs.com/zhuyf87/archive/2012/11/04/2753950.html

先转换为二叉树，再进行分离
 
        A
     /     \
   B         C
  / \       / \
    D           E
   / \         /
  F   H       G
             /
            I           
            
       
        A                   c          E
     /  |  \                           |
    B   D   H                          G                        
        |                              |          
        F                              I
 
