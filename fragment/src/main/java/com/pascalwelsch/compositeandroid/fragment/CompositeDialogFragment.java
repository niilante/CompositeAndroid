package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.Removable;
import com.pascalwelsch.compositeandroid.core.SuppressedException;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.SharedElementCallback;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unused", "deprecation", "JavadocReference", "WrongConstant", "RestrictedApi"})
@SuppressLint({"MissingSuperCall", "NewApi"})

/**
 * This code was auto-generated by the <a href="https://github.com/passsy/CompositeAndroid">CompositeAndroid</a> generator
 *
 * @author Pascal Welsch
 */
public class CompositeDialogFragment extends DialogFragment implements ICompositeDialogFragment {

    protected DialogFragmentDelegate delegate = new DialogFragmentDelegate(this);

    public List<Removable> addDialogFragmentPlugins(
            @NonNull final DialogFragmentPlugin... plugins) {
        final List<Removable> removables = new ArrayList<>(plugins.length);
        for (final DialogFragmentPlugin plugin : plugins) {
            removables.add(delegate.addPlugin(plugin));
        }
        return removables;
    }

    public List<Removable> addDialogFragmentPlugins(
            @NonNull final Iterable<? extends DialogFragmentPlugin> plugins) {
        final List<Removable> removables = new ArrayList<>();
        for (final DialogFragmentPlugin plugin : plugins) {
            removables.add(delegate.addPlugin(plugin));
        }
        return removables;
    }

    public List<Removable> addFragmentPlugins(@NonNull final FragmentPlugin... plugins) {
        final List<Removable> removables = new ArrayList<>(plugins.length);
        for (final FragmentPlugin plugin : plugins) {
            removables.add(delegate.addPlugin(plugin));
        }
        return removables;
    }

    public List<Removable> addFragmentPlugins(
            @NonNull final Iterable<? extends FragmentPlugin> plugins) {
        final List<Removable> removables = new ArrayList<>();
        for (final FragmentPlugin plugin : plugins) {
            removables.add(delegate.addPlugin(plugin));
        }
        return removables;
    }

    public Removable addPlugin(final DialogFragmentPlugin plugin) {
        return delegate.addPlugin(plugin);
    }

    public Removable addPlugin(final FragmentPlugin plugin) {
        return delegate.addPlugin(plugin);
    }

    @Override
    public void dismiss() {
        delegate.dismiss();
    }

    @Override
    public void dismissAllowingStateLoss() {
        delegate.dismissAllowingStateLoss();
    }

    @Override
    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        delegate.dump(prefix, fd, writer, args);
    }

    @Override
    public boolean getAllowEnterTransitionOverlap() {
        return delegate.getAllowEnterTransitionOverlap();
    }

    @Override
    public boolean getAllowReturnTransitionOverlap() {
        return delegate.getAllowReturnTransitionOverlap();
    }

    @Nullable
    @Override
    public Context getContext() {
        return delegate.getContext();
    }

    @Override
    public Dialog getDialog() {
        return delegate.getDialog();
    }

    @Nullable
    @Override
    public Object getEnterTransition() {
        return delegate.getEnterTransition();
    }

    @Nullable
    @Override
    public Object getExitTransition() {
        return delegate.getExitTransition();
    }

    /**
     * @deprecated
     */
    @NonNull
    @Override
    public LayoutInflater getLayoutInflater(@Nullable final Bundle savedFragmentState) {
        return delegate.getLayoutInflater(savedFragmentState);
    }

    @Override
    public android.arch.lifecycle.Lifecycle getLifecycle() {
        return delegate.getLifecycle();
    }

    @Override
    public LoaderManager getLoaderManager() {
        return delegate.getLoaderManager();
    }

    @Override
    public Object getReenterTransition() {
        return delegate.getReenterTransition();
    }

    @Nullable
    @Override
    public Object getReturnTransition() {
        return delegate.getReturnTransition();
    }

    @Nullable
    @Override
    public Object getSharedElementEnterTransition() {
        return delegate.getSharedElementEnterTransition();
    }

    @Nullable
    @Override
    public Object getSharedElementReturnTransition() {
        return delegate.getSharedElementReturnTransition();
    }

    @Override
    public boolean getShowsDialog() {
        return delegate.getShowsDialog();
    }

    @Override
    public int getTheme() {
        return delegate.getTheme();
    }

    @Override
    public boolean getUserVisibleHint() {
        return delegate.getUserVisibleHint();
    }

    @Nullable
    @Override
    public View getView() {
        return delegate.getView();
    }

    @Override
    public boolean isCancelable() {
        return delegate.isCancelable();
    }

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        delegate.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        delegate.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onAttach(final Context context) {
        delegate.onAttach(context);
    }

    /**
     * @deprecated
     */
    @Override
    public void onAttach(final Activity activity) {
        delegate.onAttach(activity);
    }

    @Override
    public void onAttachFragment(final Fragment childFragment) {
        delegate.onAttachFragment(childFragment);
    }

    @Override
    public void onCancel(final DialogInterface dialog) {
        delegate.onCancel(dialog);
    }

    @Override
    public void onConfigurationChanged(final Configuration newConfig) {
        delegate.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onContextItemSelected(final MenuItem item) {
        return delegate.onContextItemSelected(item);
    }

    @Override
    public void onCreate(@Nullable final Bundle savedInstanceState) {
        delegate.onCreate(savedInstanceState);
    }

    @Override
    public Animation onCreateAnimation(final int transit, final boolean enter, final int nextAnim) {
        return delegate.onCreateAnimation(transit, enter, nextAnim);
    }

    @Override
    public Animator onCreateAnimator(final int transit, final boolean enter, final int nextAnim) {
        return delegate.onCreateAnimator(transit, enter, nextAnim);
    }

    @Override
    public void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        delegate.onCreateContextMenu(menu, v, menuInfo);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(final Bundle savedInstanceState) {
        return delegate.onCreateDialog(savedInstanceState);
    }

    @Override
    public void onCreateOptionsMenu(final Menu menu, final MenuInflater inflater) {
        delegate.onCreateOptionsMenu(menu, inflater);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater,
            @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        return delegate.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onDestroy() {
        delegate.onDestroy();
    }

    @Override
    public void onDestroyOptionsMenu() {
        delegate.onDestroyOptionsMenu();
    }

    @Override
    public void onDestroyView() {
        delegate.onDestroyView();
    }

    @Override
    public void onDetach() {
        delegate.onDetach();
    }

    @Override
    public void onDismiss(final DialogInterface dialog) {
        delegate.onDismiss(dialog);
    }

    @NonNull
    @Override
    public LayoutInflater onGetLayoutInflater(@Nullable final Bundle savedInstanceState) {
        return delegate.onGetLayoutInflater(savedInstanceState);
    }

    @Override
    public void onHiddenChanged(final boolean hidden) {
        delegate.onHiddenChanged(hidden);
    }

    @Override
    public void onInflate(final Context context, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        delegate.onInflate(context, attrs, savedInstanceState);
    }

    /**
     * @deprecated
     */
    @Override
    public void onInflate(final Activity activity, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        delegate.onInflate(activity, attrs, savedInstanceState);
    }

    @Override
    public void onLowMemory() {
        delegate.onLowMemory();
    }

    @Override
    public void onMultiWindowModeChanged(final boolean isInMultiWindowMode) {
        delegate.onMultiWindowModeChanged(isInMultiWindowMode);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        return delegate.onOptionsItemSelected(item);
    }

    @Override
    public void onOptionsMenuClosed(final Menu menu) {
        delegate.onOptionsMenuClosed(menu);
    }

    @Override
    public void onPause() {
        delegate.onPause();
    }

    @Override
    public void onPictureInPictureModeChanged(final boolean isInPictureInPictureMode) {
        delegate.onPictureInPictureModeChanged(isInPictureInPictureMode);
    }

    @Override
    public void onPrepareOptionsMenu(final Menu menu) {
        delegate.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        delegate.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void onResume() {
        delegate.onResume();
    }

    @Override
    public void onSaveInstanceState(@NonNull final Bundle outState) {
        delegate.onSaveInstanceState(outState);
    }

    @Override
    public void onStart() {
        delegate.onStart();
    }

    @Override
    public void onStop() {
        delegate.onStop();
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable final Bundle savedInstanceState) {
        delegate.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onViewStateRestored(@Nullable final Bundle savedInstanceState) {
        delegate.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void postponeEnterTransition() {
        delegate.postponeEnterTransition();
    }

    @Override
    public void registerForContextMenu(final View view) {
        delegate.registerForContextMenu(view);
    }

    @Override
    public void setAllowEnterTransitionOverlap(final boolean allow) {
        delegate.setAllowEnterTransitionOverlap(allow);
    }

    @Override
    public void setAllowReturnTransitionOverlap(final boolean allow) {
        delegate.setAllowReturnTransitionOverlap(allow);
    }

    @Override
    public void setArguments(@Nullable final Bundle args) {
        delegate.setArguments(args);
    }

    @Override
    public void setCancelable(final boolean cancelable) {
        delegate.setCancelable(cancelable);
    }

    @Override
    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        delegate.setEnterSharedElementCallback(callback);
    }

    @Override
    public void setEnterTransition(@Nullable final Object transition) {
        delegate.setEnterTransition(transition);
    }

    @Override
    public void setExitSharedElementCallback(final SharedElementCallback callback) {
        delegate.setExitSharedElementCallback(callback);
    }

    @Override
    public void setExitTransition(@Nullable final Object transition) {
        delegate.setExitTransition(transition);
    }

    @Override
    public void setHasOptionsMenu(final boolean hasMenu) {
        delegate.setHasOptionsMenu(hasMenu);
    }

    @Override
    public void setInitialSavedState(@Nullable final Fragment.SavedState state) {
        delegate.setInitialSavedState(state);
    }

    @Override
    public void setMenuVisibility(final boolean menuVisible) {
        delegate.setMenuVisibility(menuVisible);
    }

    @Override
    public void setReenterTransition(@Nullable final Object transition) {
        delegate.setReenterTransition(transition);
    }

    @Override
    public void setRetainInstance(final boolean retain) {
        delegate.setRetainInstance(retain);
    }

    @Override
    public void setReturnTransition(@Nullable final Object transition) {
        delegate.setReturnTransition(transition);
    }

    @Override
    public void setSharedElementEnterTransition(@Nullable final Object transition) {
        delegate.setSharedElementEnterTransition(transition);
    }

    @Override
    public void setSharedElementReturnTransition(@Nullable final Object transition) {
        delegate.setSharedElementReturnTransition(transition);
    }

    @Override
    public void setShowsDialog(final boolean showsDialog) {
        delegate.setShowsDialog(showsDialog);
    }

    @Override
    public void setStyle(final int style, @StyleRes final int theme) {
        delegate.setStyle(style, theme);
    }

    @Override
    public void setTargetFragment(@Nullable final Fragment fragment, final int requestCode) {
        delegate.setTargetFragment(fragment, requestCode);
    }

    @Override
    public void setUserVisibleHint(final boolean isVisibleToUser) {
        delegate.setUserVisibleHint(isVisibleToUser);
    }

    @Override
    public void setupDialog(final Dialog dialog, final int style) {
        delegate.setupDialog(dialog, style);
    }

    @Override
    public boolean shouldShowRequestPermissionRationale(@NonNull final String permission) {
        return delegate.shouldShowRequestPermissionRationale(permission);
    }

    @Override
    public void show(final FragmentManager manager, final String tag) {
        delegate.show(manager, tag);
    }

    @Override
    public int show(final FragmentTransaction transaction, final String tag) {
        return delegate.show(transaction, tag);
    }

    @Override
    public void startActivity(final Intent intent) {
        delegate.startActivity(intent);
    }

    @Override
    public void startActivity(final Intent intent, @Nullable final Bundle options) {
        delegate.startActivity(intent, options);
    }

    @Override
    public void startActivityForResult(final Intent intent, final int requestCode) {
        delegate.startActivityForResult(intent, requestCode);
    }

    @Override
    public void startActivityForResult(final Intent intent, final int requestCode,
            @Nullable final Bundle options) {
        delegate.startActivityForResult(intent, requestCode, options);
    }

    @Override
    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        try {
            delegate.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask,
                    flagsValues, extraFlags, options);
        } catch (SuppressedException e) {
            throw (IntentSender.SendIntentException) e.getCause();
        }
    }

    @Override
    public void startPostponedEnterTransition() {
        delegate.startPostponedEnterTransition();
    }

    @Override
    public void super_dismiss() {
        super.dismiss();
    }

    @Override
    public void super_dismissAllowingStateLoss() {
        super.dismissAllowingStateLoss();
    }

    @Override
    public void super_dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        super.dump(prefix, fd, writer, args);
    }

    @Override
    public boolean super_getAllowEnterTransitionOverlap() {
        return super.getAllowEnterTransitionOverlap();
    }

    @Override
    public boolean super_getAllowReturnTransitionOverlap() {
        return super.getAllowReturnTransitionOverlap();
    }

    @Nullable
    @Override
    public Context super_getContext() {
        return super.getContext();
    }

    @Override
    public Dialog super_getDialog() {
        return super.getDialog();
    }

    @Nullable
    @Override
    public Object super_getEnterTransition() {
        return super.getEnterTransition();
    }

    @Nullable
    @Override
    public Object super_getExitTransition() {
        return super.getExitTransition();
    }

    /**
     * @deprecated
     */
    @NonNull
    @Override
    public LayoutInflater super_getLayoutInflater(@Nullable final Bundle savedFragmentState) {
        return super.getLayoutInflater(savedFragmentState);
    }

    @Override
    public android.arch.lifecycle.Lifecycle super_getLifecycle() {
        return super.getLifecycle();
    }

    @Override
    public LoaderManager super_getLoaderManager() {
        return super.getLoaderManager();
    }

    @Override
    public Object super_getReenterTransition() {
        return super.getReenterTransition();
    }

    @Nullable
    @Override
    public Object super_getReturnTransition() {
        return super.getReturnTransition();
    }

    @Nullable
    @Override
    public Object super_getSharedElementEnterTransition() {
        return super.getSharedElementEnterTransition();
    }

    @Nullable
    @Override
    public Object super_getSharedElementReturnTransition() {
        return super.getSharedElementReturnTransition();
    }

    @Override
    public boolean super_getShowsDialog() {
        return super.getShowsDialog();
    }

    @Override
    public int super_getTheme() {
        return super.getTheme();
    }

    @Override
    public boolean super_getUserVisibleHint() {
        return super.getUserVisibleHint();
    }

    @Nullable
    @Override
    public View super_getView() {
        return super.getView();
    }

    @Override
    public boolean super_isCancelable() {
        return super.isCancelable();
    }

    @Override
    public void super_onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void super_onActivityResult(final int requestCode, final int resultCode,
            final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void super_onAttach(final Context context) {
        super.onAttach(context);
    }

    /**
     * @deprecated
     */

    @Override
    public void super_onAttach(final Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void super_onAttachFragment(final Fragment childFragment) {
        super.onAttachFragment(childFragment);
    }

    @Override
    public void super_onCancel(final DialogInterface dialog) {
        super.onCancel(dialog);
    }

    @Override
    public void super_onConfigurationChanged(final Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean super_onContextItemSelected(final MenuItem item) {
        return super.onContextItemSelected(item);
    }

    @Override
    public void super_onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public Animation super_onCreateAnimation(final int transit, final boolean enter,
            final int nextAnim) {
        return super.onCreateAnimation(transit, enter, nextAnim);
    }

    @Override
    public Animator super_onCreateAnimator(final int transit, final boolean enter,
            final int nextAnim) {
        return super.onCreateAnimator(transit, enter, nextAnim);
    }

    @Override
    public void super_onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @NonNull
    @Override
    public Dialog super_onCreateDialog(final Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }

    @Override
    public void super_onCreateOptionsMenu(final Menu menu, final MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Nullable
    @Override
    public View super_onCreateView(@NonNull final LayoutInflater inflater,
            @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void super_onDestroy() {
        super.onDestroy();
    }

    @Override
    public void super_onDestroyOptionsMenu() {
        super.onDestroyOptionsMenu();
    }

    @Override
    public void super_onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void super_onDetach() {
        super.onDetach();
    }

    @Override
    public void super_onDismiss(final DialogInterface dialog) {
        super.onDismiss(dialog);
    }

    @NonNull
    @Override
    public LayoutInflater super_onGetLayoutInflater(@Nullable final Bundle savedInstanceState) {
        return super.onGetLayoutInflater(savedInstanceState);
    }

    @Override
    public void super_onHiddenChanged(final boolean hidden) {
        super.onHiddenChanged(hidden);
    }

    @Override
    public void super_onInflate(final Context context, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        super.onInflate(context, attrs, savedInstanceState);
    }

    /**
     * @deprecated
     */

    @Override
    public void super_onInflate(final Activity activity, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        super.onInflate(activity, attrs, savedInstanceState);
    }

    @Override
    public void super_onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void super_onMultiWindowModeChanged(final boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);
    }

    @Override
    public boolean super_onOptionsItemSelected(final MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void super_onOptionsMenuClosed(final Menu menu) {
        super.onOptionsMenuClosed(menu);
    }

    @Override
    public void super_onPause() {
        super.onPause();
    }

    @Override
    public void super_onPictureInPictureModeChanged(final boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
    }

    @Override
    public void super_onPrepareOptionsMenu(final Menu menu) {
        super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void super_onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void super_onResume() {
        super.onResume();
    }

    @Override
    public void super_onSaveInstanceState(@NonNull final Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void super_onStart() {
        super.onStart();
    }

    @Override
    public void super_onStop() {
        super.onStop();
    }

    @Override
    public void super_onViewCreated(@NonNull final View view,
            @Nullable final Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void super_onViewStateRestored(@Nullable final Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void super_postponeEnterTransition() {
        super.postponeEnterTransition();
    }

    @Override
    public void super_registerForContextMenu(final View view) {
        super.registerForContextMenu(view);
    }

    @Override
    public void super_setAllowEnterTransitionOverlap(final boolean allow) {
        super.setAllowEnterTransitionOverlap(allow);
    }

    @Override
    public void super_setAllowReturnTransitionOverlap(final boolean allow) {
        super.setAllowReturnTransitionOverlap(allow);
    }

    @Override
    public void super_setArguments(@Nullable final Bundle args) {
        super.setArguments(args);
    }

    @Override
    public void super_setCancelable(final boolean cancelable) {
        super.setCancelable(cancelable);
    }

    @Override
    public void super_setEnterSharedElementCallback(final SharedElementCallback callback) {
        super.setEnterSharedElementCallback(callback);
    }

    @Override
    public void super_setEnterTransition(@Nullable final Object transition) {
        super.setEnterTransition(transition);
    }

    @Override
    public void super_setExitSharedElementCallback(final SharedElementCallback callback) {
        super.setExitSharedElementCallback(callback);
    }

    @Override
    public void super_setExitTransition(@Nullable final Object transition) {
        super.setExitTransition(transition);
    }

    @Override
    public void super_setHasOptionsMenu(final boolean hasMenu) {
        super.setHasOptionsMenu(hasMenu);
    }

    @Override
    public void super_setInitialSavedState(@Nullable final Fragment.SavedState state) {
        super.setInitialSavedState(state);
    }

    @Override
    public void super_setMenuVisibility(final boolean menuVisible) {
        super.setMenuVisibility(menuVisible);
    }

    @Override
    public void super_setReenterTransition(@Nullable final Object transition) {
        super.setReenterTransition(transition);
    }

    @Override
    public void super_setRetainInstance(final boolean retain) {
        super.setRetainInstance(retain);
    }

    @Override
    public void super_setReturnTransition(@Nullable final Object transition) {
        super.setReturnTransition(transition);
    }

    @Override
    public void super_setSharedElementEnterTransition(@Nullable final Object transition) {
        super.setSharedElementEnterTransition(transition);
    }

    @Override
    public void super_setSharedElementReturnTransition(@Nullable final Object transition) {
        super.setSharedElementReturnTransition(transition);
    }

    @Override
    public void super_setShowsDialog(final boolean showsDialog) {
        super.setShowsDialog(showsDialog);
    }

    @Override
    public void super_setStyle(final int style, @StyleRes final int theme) {
        super.setStyle(style, theme);
    }

    @Override
    public void super_setTargetFragment(@Nullable final Fragment fragment, final int requestCode) {
        super.setTargetFragment(fragment, requestCode);
    }

    @Override
    public void super_setUserVisibleHint(final boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
    }

    @Override
    public void super_setupDialog(final Dialog dialog, final int style) {
        super.setupDialog(dialog, style);
    }

    @Override
    public boolean super_shouldShowRequestPermissionRationale(@NonNull final String permission) {
        return super.shouldShowRequestPermissionRationale(permission);
    }

    @Override
    public void super_show(final FragmentManager manager, final String tag) {
        super.show(manager, tag);
    }

    @Override
    public int super_show(final FragmentTransaction transaction, final String tag) {
        return super.show(transaction, tag);
    }

    @Override
    public void super_startActivity(final Intent intent) {
        super.startActivity(intent);
    }

    @Override
    public void super_startActivity(final Intent intent, @Nullable final Bundle options) {
        super.startActivity(intent, options);
    }

    @Override
    public void super_startActivityForResult(final Intent intent, final int requestCode) {
        super.startActivityForResult(intent, requestCode);
    }

    @Override
    public void super_startActivityForResult(final Intent intent, final int requestCode,
            @Nullable final Bundle options) {
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override
    public void super_startIntentSenderForResult(final IntentSender intent, final int requestCode,
            @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues,
                extraFlags, options);
    }

    @Override
    public void super_startPostponedEnterTransition() {
        super.startPostponedEnterTransition();
    }

    @Override
    public String super_toString() {
        return super.toString();
    }

    @Override
    public void super_unregisterForContextMenu(final View view) {
        super.unregisterForContextMenu(view);
    }

    @Override
    public String toString() {
        return delegate.toString();
    }

    @Override
    public void unregisterForContextMenu(final View view) {
        delegate.unregisterForContextMenu(view);
    }
}
