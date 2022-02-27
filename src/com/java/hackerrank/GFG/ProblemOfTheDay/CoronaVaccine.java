package com.java.hackerrank.GFG.ProblemOfTheDay;

/* Geek has developed an effective vaccine for Corona virus and he wants each of the N houses in Geek Land to have access to it. Given a binary tree where each node represents a house in Geek Land, find the minimum number of houses that should be supplied with the vaccine kit if one vaccine kit is sufficient for that house, its parent house and it's immediate child nodes.

Input:
        1
        / \
        2   3
        Output:
        1
        Explanation:
        The vaccine kits should be
        supplied to house number 1.*/
public class CoronaVaccine {

}

//  C++ Solution
  /*      public:
        void takeparent(Node*root, unordered_map<Node*,Node*> &m)
        {
            if(root){
                if(root->left)
                {
                    m[root->left]=root;
                    takeparent(root->left,m);
                }
                if(root->right)
                {
                    m[root->right]=root;
                    takeparent(root->right,m);
                }
            }
        }


        int supplyVaccine(Node* root){
            // Your code goes here
            int count=0;
            unordered_map<Node*,Node*> m;
            m[root]=NULL;
            takeparent(root,m);

            queue<Node*> q;
            vector<Node*> vn;

            q.push(root);
            while(!q.empty())
            {
                Node* p= q.front();
                q.pop();

                if(p->right)
                    q.push(p->right);
                if(p->left)
                    q.push(p->left);

                vn.push_back(p);
            }

            //  -2 covered without kit
            //   -1 covered with kit

            for(int i=vn.size()-1; i>=0; i--)
            {
                Node* p= vn[i];

                if(p->data == -1 || p->data==-2)
                    continue;


                if(m[p])
                {
                    m[p]->data=-1;
                    count++;
                }
                else
                {
                    p->data=-1;
                    count++;
                    continue;
                }

                if(m[p]->left)
                m[p]->left->data=-2;
                if(m[p]->right)
                m[p]->right->data=-2;

                if(m[m[p]])
                    m[m[p]]->data=-2;

            }
            return count;

        }
    };
  */