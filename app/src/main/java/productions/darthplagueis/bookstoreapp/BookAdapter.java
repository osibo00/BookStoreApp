package productions.darthplagueis.bookstoreapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import productions.darthplagueis.bookstoreapp.model.Book;
import productions.darthplagueis.bookstoreapp.view.BookViewHolder;

/**
 * Created by oleg on 1/3/18.
 */

public class BookAdapter extends RecyclerView.Adapter<BookViewHolder> {
    private List<Book> bookList;

    public BookAdapter(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_itemview, parent, false);
        return new BookViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, int position) {
        ((BookViewHolder) holder).onBind(bookList.get(position));
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }
}
