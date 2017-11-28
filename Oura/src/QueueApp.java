
public class QueueApp {
	
	int[] qArray;
	int front,rear;
	int size;
	int nItems;
	
	QueueApp(){ //protos contructor pou arxikopoiei
		qArray=null;
		front=0;
		rear=0;
		size=0;
		nItems=0;
		}
	
	QueueApp(int n){//deuteros pou bazei tis times
		front=0;
		rear=-1;
		nItems=0;
		size=n;
		qArray=new int[n];	
	    }
	
	
	// 8a 3ekiniso me tis pio eukoles sinartiseis
	//gi auto 8a 3ekiniso me tin isEmpty
	boolean isEmpty(){
		return(nItems==0); //8a epistrepsei true den iparxoun items
	}
	
	
	//i epomeni pio eukoli isFull 
	boolean isFull(){
		return(nItems==size);//idia diadikasia alla xrisimopoio tin size kai oxi tin n
	}
	
	
	//i size i epomeni piuo eukoli
	int size(){
		return nItems; //to mege8os einai i nItems
	}
	
	
	//meta paei i peek
	int peek(){
		if (isEmpty()){
			System.out.print("ERROR:Oura adeia");
			return -1;
		}
		else{
			return qArray[front];
		}
	}
	
	
	int remove(){
		if(isEmpty()){
			System.out.print("ERROR:Oura einai adeia");
			return -1;
		}
		else{
			System.out.println(nItems);
			nItems--; //o ari8mos ton items 8a meio8ei
			front++; //eno ta prota ginontai ta epomena stin seira
			return qArray[front-1];
		}
	}
	
	
	//den 8elo na mou epistrepsei kati
	void insert(int x){  //to x einai to stoixeio pou pros8eto
		if(isFull()){
			System.out.print("ERROR:oura einai gemati");
				
		}
		else{
			if (rear==size-1){
				for(int i=0;i<nItems;i++){
					qArray[i]=qArray[front+i];
				}
				front=0;
				rear=front+nItems-1;
			}
			nItems++;
			rear++;
			qArray[rear]=x;
		}
	}
	
	//den xreiazetai na epistrepsei kati
	void printQueue(){
		for(int i=front;i<=rear;i++){
			System.out.print(qArray[i]+ " ");
		}
		System.out.println();
	}
	
	
	

	public static void main(String[] args) {
		 QueueApp a= new QueueApp(5);
		 a.insert(10);
		 a.insert(20);
		 a.insert(30);
		 a.insert(40);
		 a.insert(45);
		 a.insert(50);
		 a.printQueue();
		 a.remove();
		 a.remove();
		 a.remove();
		 a.printQueue();
		 a.insert(55);
		 a.insert(60);
		 a.insert(70);
		 a.insert(80);
		 a.printQueue();
		 for(int i=0;i<6;i++){
			 a.remove();
			 a.printQueue();
		 }
		 
	}

}
