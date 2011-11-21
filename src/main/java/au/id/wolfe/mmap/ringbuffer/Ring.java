package au.id.wolfe.mmap.ringbuffer;

import java.nio.ByteBuffer;

/**
 * Ring buffer which exposes a slot retrieval function and some statistics.
 */
public interface Ring {

    int position();

    ByteBuffer readNextSlot();

}
