package com.hannesdorfmann.annotatedadapter.recyclerview;

/**
 * @author Hannes Dorfmann
 */
interface RecyclerDelegators {

  RecyclerAdapterDelegator getDelegator(SupportAnnotatedAdapter adapter);
}