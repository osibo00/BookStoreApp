package productions.darthplagueis.bookstoreapp.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import productions.darthplagueis.bookstoreapp.R;
import productions.darthplagueis.bookstoreapp.model.Book;

/**
 * Created by oleg on 1/3/18.
 */

public class BookViewHolder extends RecyclerView.ViewHolder {
    private TextView title, author;

    public BookViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.book_title);
        author =(TextView) itemView.findViewById(R.id.book_title);
    }

    public void onBind(Book book) {
        title.setText(book.getName());
        author.setText(book.getAuthor());
    }
}
