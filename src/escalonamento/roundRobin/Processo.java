/**
 * @author Bruno Marques e Rodrigo Cunha
 * 
 * Sistemas Operacionais - 2016.1
 * Mini-simulador de processos usando round robin.
 */

package escalonamento.roundRobin;

public class Processo implements Runnable{

	private static int countID = 1;
	private int processoID;
	private long tempo;
	private volatile boolean isRun;
	
	public Processo(long processoTempo){
		this.processoID = countID;
		this.tempo = processoTempo;
		this.isRun = false;
		countID++;
	}
	
	@Override
	public void run() {
		this.isRun = true;
		while(this.isRun){

		}
	}	
	
	public void kill(){
		this.isRun = false;
	}
	
	public int getProcessoID(){
		return this.processoID;
	}
	
	public long getProcessoTempo(){
		return tempo;
	}
	
	public void setProcessoTempo(long processoTempo){
		this.tempo = processoTempo ;
	}
	
	@Override
	public String toString(){
		return "[ProcessoID: "+ this.processoID +" / Tempo: "+ this.tempo +"]";
	}
	
}
