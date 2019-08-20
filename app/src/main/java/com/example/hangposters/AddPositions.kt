package com.example.hangposters

import android.os.AsyncTask
import java.util.concurrent.ExecutionException

class AddPositions : AsyncTask<String, Void, Void>()
{

       private var mDlugTable = ServiceClient().getmInstance()?.getClient()?.getTable(Position::class.java)



    override fun onPreExecute() {
        super.onPreExecute()
    }
    val position: Position = Position()

    override fun doInBackground(vararg p0: String): Void? {
        position.setkto(p0[0])
        try {
            dodajLokalizacje(position)

        }
        catch (e:ExecutionException) {

        }
        catch (e:InterruptedException){}
        return null
    }

    override fun onPostExecute(result: Void?) {

        super.onPostExecute(result)
    }

    @Throws(ExecutionException::class, InterruptedException::class)
    private fun dodajLokalizacje(tmp: Position){
        mDlugTable?.insert(tmp)?.get()

    }
}
