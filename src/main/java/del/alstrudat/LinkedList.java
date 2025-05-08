package del.alstrudat;

public class LinkedList<T> {
  public Node head;
  public Node tail;
  public int length;

  class Node {
    T value;
    Node next;

    Node(T value) {
      this.value = value;
    }
  }

  public LinkedList() {
    length = 0;
  }

  public LinkedList(T value) {
    // TODO: Buat Node baru dan atur head, tail, dan length
    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;
    length = 1;
  }

  public void printList() {
    if (length <= 0) {
      System.out.println("- Tidak ada data yang tersedia!");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.value);
      // TODO: Pindahkan temp ke node berikutnya
      temp = temp.next;
    }
  }

  public void append(T value) {
    Node newNode = new Node(value);
    if (length == 0) {
      // TODO: Atur head dan tail saat linked list kosong
      head = newNode;
      tail = newNode;
    } else {
      // TODO: Hubungkan tail saat ini ke newNode dan update tail
      tail.next = newNode;
      tail = newNode;
    }
    length++;
  }

  public Node removeLast() {
    if (length == 0)
      return null;
    Node temp = head;
    Node pre = head;
    while (temp.next != null) {
      // TODO: Geser pre dan temp
      pre = temp;
      temp = temp.next;
    }
    tail = pre;
    tail.next = null;
    length--;
    if (length == 0) {
      head = null;
      tail = null;
    }
    return temp;
  }

  public void prepend(T value) {
    Node newNode = new Node(value);
    if (length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      // TODO: Set newNode.next ke head dan update head
      newNode.next = head;
      head = newNode;
    }
    length++;
  }

  public Node removeFirst() {
    if (length == 0)
      return null;
    Node temp = head;
    head = head.next;
    temp.next = null;
    length--;
    if (length == 0) {
      tail = null;
    }
    return temp;
  }

  public Node get(int index) {
    if (index < 0 || index >= length)
      return null;
    Node temp = head;
    for (int i = 0; i < index; i++) {
      // TODO: Geser temp ke node berikutnya
      temp = temp.next;
    }
    return temp;
  }

  public boolean set(int index, T value) {
    Node temp = get(index);
    if (temp != null) {
      // TODO: Ganti value dari node temp
      temp.value = value;
      return true;
    }
    return false;
  }

  public boolean insert(int index, T value) {
    if (index < 0 || index > length)
      return false;
    if (index == 0) {
      prepend(value);
      return true;
    }
    if (index == length) {
      append(value);
      return true;
    }
    Node newNode = new Node(value);
    Node temp = get(index - 1);
    // TODO: Hubungkan newNode ke temp.next dan temp ke newNode
    newNode.next = temp.next;
    temp.next = newNode;
    length++;
    return true;
  }

  public Node remove(int index) {
    if (index < 0 || index >= length)
      return null;
    if (index == 0)
      return removeFirst();
    if (index == length - 1)
      return removeLast();
    Node prev = get(index - 1);
    Node temp = prev.next;
    // TODO: Hapus temp dari linked list
    prev.next = temp.next;
    temp.next = null;
    length--;
    return temp;
  }

  public void reverse() {
    Node temp = head;
    head = tail;
    tail = temp;
    Node after;
    Node before = null;
    for (int i = 0; i < length; i++) {
      after = temp.next;
      temp.next = before;
      before = temp;
      temp = after;
    }
  }

  public void duplicate() {
    Node temp = head;
    while (temp != null) {
      Node duplicateNode = new Node(temp.value);
      // TODO: Sisipkan duplicateNode setelah temp
      duplicateNode.next = temp.next;
      temp.next = duplicateNode;
      temp = duplicateNode.next;
      length++;
    }
  }
}
