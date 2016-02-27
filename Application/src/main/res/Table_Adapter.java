/**
 * Created by badda_000 on 2/27/2016.
 */
package com.example.android.camera2basic;

//import capital one bills
public class Table_Adapter extends ArrayAdapter<Bill> {
    private final Context context;
    private final Bill[] values;

    public MySimpleArrayAdapter(Context context, Bill[] values) {
        super(context, -1, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View tableItem = inflater.inflate(R.layout.table_item, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        textView.setText(values[position]);
        // change the icon for Windows and iPhone
        String s = values[position];
        if (s.startsWith("iPhone")) {
            imageView.setImageResource(R.drawable.no);
        } else {
            imageView.setImageResource(R.drawable.ok);
        }

        return rowView;
    }
}

}
        /*
        nessieClient.getBills("56c66be6a73e492741507e36", new NessieResultsListener() {
@Override
public void onSuccess(Object result, NessieException e) {
        if(e == null){
        ArrayList<Bill> bills = (ArrayList<Bill>) result;
        System.out.println("BILLS TEST");
        System.out.println(bills.size());
        for(Bill bill:bills){
        System.out.println(bill.toString());
        }
        } else {
        System.out.println(e.toString());
        }
        }
        });

                        */