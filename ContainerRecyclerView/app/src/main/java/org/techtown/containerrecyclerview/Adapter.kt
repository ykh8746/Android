package org.techtown.containerrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.techtown.containerrecyclerview.databinding.ItemRecyclerBinding
import java.text.SimpleDateFormat

class Adapter : RecyclerView.Adapter<Holder>(){
    var listData = mutableListOf<Memo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {//아이템 레이아웃 생성
        val binding = ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return Holder(binding)
    }

    override fun getItemCount(): Int {//사용할 데이터 개수
        return listData.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {//생성된 뷰홀더를 화면에 보여줌
        val memo = listData.get(position)
        holder.setMemo(memo)
    }
}

class Holder(val binding : ItemRecyclerBinding) : RecyclerView.ViewHolder(binding.root){
    fun setMemo(memo : Memo){
        binding.textNo.text = "${memo.no}"
        binding.textTitle.text = memo.title

        var sdf = SimpleDateFormat("yyyy/MM/dd")
        var formattedDate = sdf.format(memo.timestamp)
        binding.textDate.text = formattedDate
    }

}