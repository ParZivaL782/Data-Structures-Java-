// package academy.learnprogramming.hashtable;

// public class SimpleHashtable 
// {

//     private storedEmployee[] hashtable;

//     public SimpleHashtable() {
//         hashtable = new storedEmployee[10];
//     }

//     public void put(String key, Employee employee) 
//     {
//         int hashedKey = hashKey(key);
//         if (hashtable[hashedKey] != null) 
//         {
//             int stopindex = hashedKey;

//             if (hashedKey == hashtable.length - 1) 
//             {
//                 hashedKey = 0;
//             } 
//             else 
//             {
//                 hashedKey += 1;
//             }

//             while (hashtable[hashedKey] != null && hashedKey != stopindex) 
//             {
//                hashedKey=(hashedKey+1) % hashtable.length;

//             }
//         }
//         if (hashtable[hashedKey] != null) {
//             System.out.println("Sorry the table is full cannot add" + key);
//         } 
//         else 
//         {
//             hashtable[hashedKey] = new storedEmployee(key, employee);
//         }

//     }

//     public Employee remove(String key)
//     {
//         int hashedKey=findKey(key);
//         Employee removedEmployee=hashtable[hashedKey].employee;
//         hashtable[hashedKey]=null;

//         storedEmployee[] oldTable=hashtable;
//         hashtable=new storedEmployee[oldTable.length];
//         for(int i=0;i<oldTable.length;i++)
//         {
//             if(oldTable[i]!=null)
//             {
//                 put(oldTable[i].key, oldTable[i].employee);
//             }
//         }

//         return removedEmployee;
//     }


//     public int findKey(String key) 
//     {
//         int hashedKey = hashKey(key);
//         if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) 
//         {
//             return hashedKey;
//         }
//         if(hashtable[hashedKey] == null)
//         {
//             return -1;
//         }

//         int stopindex = hashedKey;
//         if (hashedKey == hashtable.length - 1) 
//         {
//             hashedKey = 0;
//         } 
//         else 
//         {
//             hashedKey += 1;
//         }

//         while (hashtable[hashedKey] != null && hashedKey != stopindex && !hashtable[hashedKey].key.equals(key)) 
//         {
//            hashedKey=(hashedKey+1)%hashtable.length;
//         }


//         if(hashedKey==stopindex)
//         {
//             return -1;
//         }
//         else
//         {
//             return hashedKey;
//         }



//     }

//     public Employee get(String key) {
//         int hashedKey = findKey(key);
//         if(hashedKey==-1)
//         {
//             return null;
//         }
//         else
//         {
//             return hashtable[hashedKey].employee;
//         }
       
//     }

//     private int hashKey(String key) {
//         return key.length() % hashtable.length;
//     }

//     public void printHashtable() {
//         for (int i = 0; i < hashtable.length; i++) 
//         {
//             if(hashtable[i]==null)
//             {
//                 System.out.println("Null");
//             }
//             else
//             {
//                 System.out.println("Position "+i+": "+hashtable[i].employee);
//             }
//         }
//     }

// }
