public class QuestionDetails1


int ques_id;

String ques_des;

 int[] year;

 String concept;


public int[] getYear()



 {

return year;


public String getQuest_Des()

return ques_des;


public String getConcept () (


return concept;
 public QuestionDetails (int ques_id, String ques_des, int[] year, String concept) 




super();

this.ques_id = ques_id;

this.ques des=ques_des:



this.year=this. year = year;

this.concept = concept:

)


public static ArrayList<String> getMaxQuestion (int year, ArrayList a)

(

ArrayList<String> b=new ArrayList<>();

36 for (int i=0;i<a.size();i++) {


object o-a.get(i);



QuestionDetails q =(QuestionDetails) or int[] ayear=q.getYear();



int k=0;



for (int j=0;j<ayear.length; j++) {

if (ayear [j]=year) [



b.add(q.getQuest_Des());
} }}


 return bil
 public static String getMaxConcept (ArrayList a) {



int[] b-new int[a.size()];



int index=0;

for (int i=0;i<a.size();i++) { String c1-((QuestionDetails) (a.get(i))).getConcept();


int count=0;

for (int j=i+1;j<a.size();j++) { string c2=((QuestionDetails) (a.get(j))).getConcept();



if (cl.equals (c2)) {


count++;




if (b[i]!= -1) 
{



b[i]=count;



int max-b[0];


for (int i=1;i<b.length;i++) {


if (max<b[i]).



max=b[i];



index=i;




return ((QuestionDetails) (a.qet (index))).getConcept();
}