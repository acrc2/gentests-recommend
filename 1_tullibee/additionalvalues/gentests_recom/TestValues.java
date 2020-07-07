package gentests_recom;

import randoop.*;
import java.io.*;
import com.ib.client.*;
import java.util.*;
import java.net.Socket;
import java.util.Vector;

public class TestValues {
  
  /*** Claudio Carvalho ***/
	
	public static Vector vectorOne() {
		return new Vector(Arrays.asList("A", "B", "C"));
	}

	public static Vector vectorTwo() {
		return new Vector(Arrays.asList("X", "Y", "Z"));
	}

	public static Vector vectorThree() {
		return new Vector(Arrays.asList("X", "Y"));
	}

	public static Vector vectorFour() {
		return new Vector();
	}

    /** Lais **/
  
    public static TickType tickTypeOne () {
    	TickType tick = new TickType();
    	for (int i = 0; i < 50; i ++) {
    		tick.getField(i);
    	}
    	
    	return tick;
    }

        public static UnderComp underCompOne () {
    	UnderComp under = new UnderComp();
    	under.m_delta = 0;
    	under.m_conId = 0;
    	under.m_price = 0;
    	UnderComp underZero = new UnderComp();
    	underZero.m_delta = 0;
    	underZero.m_conId = 0;
    	underZero.m_price = 0;
    	under.equals(underZero);
    	
    	return under;
    }
    
    public static UnderComp underCompTwo () {
    	UnderComp under = new UnderComp();
    	under.equals(null);
    	
    	return under;
    }
 
    public static UnderComp underCompThree () {
    	UnderComp under = new UnderComp();
    	UnderComp underNotZero = new UnderComp();
    	underNotZero.m_conId = 1;
    	under.equals(underNotZero);
    	
    	return under;
    }
    
    public static UnderComp underCompThree1 () {
    	UnderComp under = new UnderComp();
    	UnderComp underNotZero = new UnderComp();
    	underNotZero.m_delta = 1.0;
    	under.equals(underNotZero);
    	
    	return under;
    }
    
    public static UnderComp underCompThree2 () {
    	UnderComp under = new UnderComp();
    	UnderComp underNotZero = new UnderComp();
    	underNotZero.m_price = 2.0;
    	under.equals(underNotZero);
    	
    	return under;
    }

	 /*** Arthur Castro***/

		//CONTRACT_DATA, 582 - 626 (if 606 branch true 609/612/616 branches false)
    public static DataInputStream disOne_ac() {
		String action = "10";
		int integer = 2;
		String str = "3";
		double value = 1.999;
		String all = action + "\0" + integer + "\0" + str + "\0"
		+ str + "\0"+ str + "\0"+ value + "\0" + str + "\0"
		+ str + "\0" + str + "\0" + str + "\0" + str + "\0" + str + "\0"
		+ "\0" + integer + "\0"+ value +"\0" + str + "\0" +str + "\0"+ integer + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}
  //DELTA_NEUTRAL_VALIDATION, 867 - 877 
	public static DataInputStream disTwo_ac() {
		String action = "56";
		int integer = 2;
		double value = 1.999;
		String all = action + "\0" + integer + "\0" + integer + "\0" + integer + "\0" +
		value + "\0" + value + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	//TICK_SNAPSHOT_END, 879 - 884
	public static DataInputStream disThree_ac() {
		String action = "57";
		int integer = 2;
		String all = action + "\0" + integer + "\0" + integer + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	//eWrapper().deltaNeutralValidation, 876 - 877
	public static EReader eReaderTwo() {
		return new com.ib.client.EReader(disTwo(), eWrapperOne(), 44);
	}
	
	//eWrapper().tickSnapshotEnd, 883 - 884
	public static EReader eReaderThree() {
		return new com.ib.client.EReader(disThree(), eWrapperOne(), 44);
	}
  
  /** Lucas Cardoso **/
	
    public static DataInputStream portfolioCaseDataStream() {
        String action = "7";
        String version = "7";
        String conId = "1";
        String symbol = "a";
        String secType = "b";
        String expirity = "c";
        String strike = "1.42";
        String right = "d";
        String multiplier = "e";
        String primaryExch = "f";
        String currency = "g";
        String localSymbol = "h";
        String position = "1";
        String marketPrice = "1.5";
        String marketValue = "2.1";
        String averageCost = "1.1";
        String unrealizedPNL = "2.2";
        String realizedPNL = "3.1";
        String accountName = "i";
        String end = "-1";
        String all = action + "\0" + version + "\0" + conId + "\0" + symbol + "\0" + secType + "\0" 
            + expirity + "\0" + strike + "\0" + right + "\0" + multiplier + "\0" + primaryExch + "\0"
            + currency + "\0" + localSymbol + "\0" + position + "\0" + marketPrice + "\0" + marketValue + "\0"
            + averageCost + "\0" + unrealizedPNL + "\0" + realizedPNL + "\0" + accountName + "\0" + end + "\0";
        return new DataInputStream(new StringBufferInputStream(all));        
    }
    
    public static DataInputStream portfolioCaseDataStream2() {
        String action = "7";
        String version = "6";
        String conId = "1";
        String symbol = "a";
        String secType = "b";
        String expirity = "c";
        String strike = "1.42";
        String right = "d";
        String currency = "g";
        String localSymbol = "h";
        String position = "1";
        String marketPrice = "1.5";
        String marketValue = "2.1";
        String averageCost = "1.1";
        String unrealizedPNL = "2.2";
        String realizedPNL = "3.1";
        String accountName = "i";
        String primaryExch = "ds";
        String end = "-1";
        String all = action + "\0" + version + "\0" + conId + "\0" + symbol + "\0" + secType + "\0" 
            + expirity + "\0" + strike + "\0" + right + "\0" + currency + "\0" + localSymbol + "\0" 
            + position + "\0" + marketPrice + "\0" + marketValue + "\0"+ averageCost + "\0" 
            + unrealizedPNL + "\0" + realizedPNL + "\0" + accountName + "\0" + primaryExch + "\0" + end + "\0";
        return new DataInputStream(new StringBufferInputStream(all));        
    }
    
    public static DataInputStream acctUpdateTimeDatastream() {
        String action = "8";
        String version = "6";
        String timeStamp = "qw";
        String end = "-1";
        String all = action + "\0" + version + "\0" + timeStamp + end + "\0";
        return new DataInputStream(new StringBufferInputStream(all));        
    }

    // public static EReader reader() {
	// 	return new EReader(disOne(),eWrapperOne(), 39);
	// }
    
    public static EReader reader2() {
        return new EReader(portfolioCaseDataStream(),eWrapperOne(), version()); /* version() defined by Marcela */
    }
    
    public static EReader reader3() {
        return new EReader(portfolioCaseDataStream2(),eWrapperOne(), version());
    }
    
    public static EReader reader4() {
        return new EReader(acctUpdateTimeDatastream(), eWrapperOne(), version());
    }
    
  
    /** Marcela **/
  
    public static DataInputStream msgId() {
        return new DataInputStream(new StringBufferInputStream("1\0"));
    }


	public static DataInputStream nextValidIdCase() {
		String switchCase = "9";
		String version = "2";
		String orderId = "8";
		String all = switchCase+"\0"+version+"\0"+orderId+"\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream managedAcctsCase() {
		String switchCase = "15";
		String version = "2";
		String accountsList = "2,3,5,12";
		String all = switchCase+"\0"+version+"\0"+accountsList+"\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream receiveFaCase() {
		String switchCase = "16";
		String version = "2";
		String faDataType = "14";
		String xml = "<?xml version='1.0'?>";
		String all = switchCase+"\0"+version+"\0"+faDataType+"\0"+xml+"\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static int version() {
		return 39;
	}

	public static EReader readerNextValidIdCase() {
		return new EReader(nextValidIdCase(), eWrapperOne(), version());
	}

	public static EReader readerManagedAcctsCase() {
		return new EReader(managedAcctsCase(), eWrapperOne(), version());
	}

	public static EReader readerReceiveFaCase() {
		return new EReader(receiveFaCase(), eWrapperOne(), version());
	}

  
  /** Aldiberg  does not improve coverage **/

    public static DataInputStream disOneOne() {
		//BOND_CONTRACT_DATA
		String str = "kkeaemen";
		Double dd = 7.77;
		int interino = 1;
		String action = "18";
		String input = action + "\0" + interino + "\0"+ str +"\0" + str + "\0" + 
		str +"\0" + dd + "\0"+ str +"\0" + str + "\0"+ str +"\0" +
		str + "\0"+ str +"\0" + interino + "\0"+ 
		interino +"\0" + interino + "\0"+ 
		str +"\0" +  str +"\0" + str + "\0"+ str +"\0" +
		str +"\0" + interino + "\0"+ dd +"\0" +  str +"\0" + str + "\0";
        return new DataInputStream(new StringBufferInputStream(input));
	}

	public static DataInputStream disOneTwo() {
		//ACCT_DOWNLOAD_END
		String action = "54";
		String interino = "1";
		String textinput = "berg";
		String input =  action + "\0"+ interino + "\0" + textinput+ "\0";
        return new DataInputStream(new StringBufferInputStream(input));
	}

	public static DataInputStream disOneThree() {
		//EXECUTION_DATA_END
		String action = "55";
		String interino = "1";
		String input =  action + "\0"+ interino +"\0" + interino+ "\0";
        return new DataInputStream(new StringBufferInputStream(input));
	}
	public static void eReaderOne() {
         new com.ib.client.EReader(disOneOne(), eWrapperOne(), 44).run();
	}
	public static void eReaderTwo() {
         new com.ib.client.EReader(disOneTwo(), eWrapperOne(), 44).run();
	}
	public static void eReaderThree() {
         new com.ib.client.EReader(disOneThree(), eWrapperOne(), 44).run();
    }
  

  /*** Daniel Bastos ***/
	
	public static DataInputStream disOne_db() {
		String action = "52";
		String part1 = "2";
		String part2 = "3";
		String all = action + "\0" + part1 + "\0" + part2 + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream disTwo_db() {
		String action = "53";
		String part1 = "2";
		String all = action + "\0" + part1 + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static void eReaderOne_db() {
		new com.ib.client.EReader(disTwo_db(), eWrapperOne(), 44).run();
	}

	public static void eReaderTwo_db() {
		new com.ib.client.EReader(disOne_db(), eWrapperOne(), 44).run();
	}

	public static void eReaderThree_db() {
		String answer = "11" + "\0" + "7" + "\0";
		for(int i = 0; i < 23; i++) {
			answer += "11" + "\0";
		}
		new com.ib.client.EReader(new DataInputStream(new StringBufferInputStream(answer)), eWrapperOne(), 44).run();
	}

  
  /*** Lucas Barros ***/
  
  	public static DataInputStream disOne2() {
        return new DataInputStream(new StringBufferInputStream(getScannerDataWithVersionAndNumberOfElements("3", "1")));
    }

	public static DataInputStream disOne3() {
        return new DataInputStream(new StringBufferInputStream(getScannerDataWithVersionAndNumberOfElements("3", "0")));
    }

      
   public static DataInputStream disOne4() {
        return new DataInputStream(new StringBufferInputStream(getScannerDataWithVersionAndNumberOfElements("0", "1")));
    }

	private static String getScannerDataWithVersionAndNumberOfElements(String version, String numberOfElements) {
		String action = "20";
        String tickerId = "3";
        String all = action + "\0" + version + "\0" + tickerId + "\0" + numberOfElements + "\0";
		
		if (Integer.parseInt(numberOfElements) > 0) {
			String rank = "1";
			
			all += rank + "\0";

			if (Integer.parseInt(version) >= 3) {
				String m_conId = "1";
				all += m_conId + "\0";
			}

			for (int i = 0; i < 3; i++) {
				all += "a" + "\0";
			}
			
			String m_strike = "2.8";
			all += m_strike + "\0";

			for (int i = 0; i < 9; i++) {
				all += "a" + "\0";
			} 
			
			if (Integer.parseInt(version) >= 2) {
				String legsStr = "a";
				all += legsStr + "\0";
			}
		}

		return all;
	}

    /** Marcelo **/
  
 public static DataInputStream disOne() {
        String action = "1";
        String part1 = "2";
        String part2 = "3";
        String part3 = "4";
        String part4 = "2.97";
        String part5 = "1";
        String end = "-1";
        String all = action + "\0" + part1 + "\0" + part2 + "\0" + part3 + "\0" + part4 + "\0" + part5 + "\0" + end + "\0";
        return new DataInputStream(new StringBufferInputStream(all));
    }

	
    public static EWrapper eWrapperOne() {

        return new com.ib.client.EWrapper() {

	   	@Override
	   	public void error(Exception e) { e.printStackTrace(); }

	   	@Override
	   	public void error(String str) {}

	   	@Override
	   	public void error(int id, int errorCode, String errorMsg) {	}

	   	@Override
	   	public void connectionClosed() {}

	   	@Override
	   	public void tickPrice(int tickerId, int field, double price, int canAutoExecute) {}

	   	@Override
	   	public void tickSize(int tickerId, int field, int size) {}

	   	@Override
	   	public void tickOptionComputation(int tickerId, int field, double impliedVol, double delta,
	   			double modelPrice, double pvDividend) {}

	   	@Override
	   	public void tickGeneric(int tickerId, int tickType, double value) {	}

	   	@Override
	   	public void tickString(int tickerId, int tickType, String value) {	}

	   	@Override
	   	public void tickEFP(int tickerId, int tickType, double basisPoints, String formattedBasisPoints,
	   			double impliedFuture, int holdDays, String futureExpiry, double dividendImpact,
	   			double dividendsToExpiry) {	}

	   	@Override
	   	public void orderStatus(int orderId, String status, int filled, int remaining, double avgFillPrice,
	   			int permId, int parentId, double lastFillPrice, int clientId, String whyHeld) {	}

	   	@Override
	   	public void openOrder(int orderId, Contract contract, Order order, OrderState orderState) {	}

	   	@Override
	   	public void openOrderEnd() {}

	   	@Override
	   	public void updateAccountValue(String key, String value, String currency, String accountName) {	}

	   	@Override
	   	public void updatePortfolio(Contract contract, int position, double marketPrice, double marketValue,
	   			double averageCost, double unrealizedPNL, double realizedPNL, String accountName) {	}

	   	@Override
	   	public void updateAccountTime(String timeStamp) {}

	   	@Override
	   	public void accountDownloadEnd(String accountName) {}

	   	@Override
	   	public void nextValidId(int orderId) {}

	   	@Override
	   	public void contractDetails(int reqId, ContractDetails contractDetails) {}

	   	@Override
	   	public void bondContractDetails(int reqId, ContractDetails contractDetails) {}

	   	@Override
	   	public void contractDetailsEnd(int reqId) {	}

	   	@Override
	   	public void execDetails(int reqId, Contract contract, Execution execution) {}

	   	@Override
	   	public void execDetailsEnd(int reqId) {	}

	   	@Override
	   	public void updateMktDepth(int tickerId, int position, int operation, int side, double price, int size) {}

	   	@Override
	   	public void updateMktDepthL2(int tickerId, int position, String marketMaker, int operation, int side,
	   			double price, int size) {}

	   	@Override
	   	public void updateNewsBulletin(int msgId, int msgType, String message, String origExchange) {	}

	   	@Override
	   	public void managedAccounts(String accountsList) {	}

	   	@Override
	   	public void receiveFA(int faDataType, String xml) {	}

	   	@Override
	   	public void historicalData(int reqId, String date, double open, double high, double low, double close,
	   			int volume, int count, double WAP, boolean hasGaps) {	}

	   	@Override
	   	public void scannerParameters(String xml) {	}

	   	@Override
	   	public void scannerData(int reqId, int rank, ContractDetails contractDetails, String distance,
	   			String benchmark, String projection, String legsStr) {	}

	   	@Override
	   	public void scannerDataEnd(int reqId) {	}

	   	@Override
	   	public void realtimeBar(int reqId, long time, double open, double high, double low, double close,
	   			long volume, double wap, int count) {	}

	   	@Override
	   	public void currentTime(long time) {	}

	   	@Override
	   	public void fundamentalData(int reqId, String data) {	}

	   	@Override
	   	public void deltaNeutralValidation(int reqId, UnderComp underComp) {	}

	   	@Override
	   	public void tickSnapshotEnd(int reqId) {	}

	   	@Override
	   	public void stopRequested() {		}

        };
        
	}
	
	public static ExecutionFilter executionFilterNull() {
		return null;
	}
 
	public static Vector vectorNull() {
		return null;
	}

	public static Vector vectorFull() {
		Vector v = new Vector();
		v.add(3);
		return v;
	}
}
