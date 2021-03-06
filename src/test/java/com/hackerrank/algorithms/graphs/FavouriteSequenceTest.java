package com.hackerrank.algorithms.graphs;

import static com.hackerrank.SolutionIO.io;

import com.hackerrank.Solution;
import com.hackerrank.SolutionIO;
import com.hackerrank.algorithms.SolutionTest;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FavouriteSequenceTest extends SolutionTest {

  @Override
  public Optional<String> casesDirectory() {
    return Optional.of("fav-seq");
  }

  @Override
  public Solution solver() {
    return new FavouriteSequence();
  }

  @Override
  public List<SolutionIO> testCases() {
    return Arrays.asList(
        io("1.in", "1.out"),
        io("2.in", "2.out"),
        io("7.in", "7.out")
    );
  }
}