// Generated by view binder compiler. Do not edit!
package com.surendramaran.yolov8tflite.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.surendramaran.yolov8tflite.OverlayView;
import com.surendramaran.yolov8tflite.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout cameraContainer;

  @NonNull
  public final TextView inferenceTime;

  @NonNull
  public final OverlayView overlay;

  @NonNull
  public final PreviewView viewFinder;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout cameraContainer, @NonNull TextView inferenceTime,
      @NonNull OverlayView overlay, @NonNull PreviewView viewFinder) {
    this.rootView = rootView;
    this.cameraContainer = cameraContainer;
    this.inferenceTime = inferenceTime;
    this.overlay = overlay;
    this.viewFinder = viewFinder;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout cameraContainer = (ConstraintLayout) rootView;

      id = R.id.inferenceTime;
      TextView inferenceTime = ViewBindings.findChildViewById(rootView, id);
      if (inferenceTime == null) {
        break missingId;
      }

      id = R.id.overlay;
      OverlayView overlay = ViewBindings.findChildViewById(rootView, id);
      if (overlay == null) {
        break missingId;
      }

      id = R.id.view_finder;
      PreviewView viewFinder = ViewBindings.findChildViewById(rootView, id);
      if (viewFinder == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, cameraContainer, inferenceTime,
          overlay, viewFinder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
