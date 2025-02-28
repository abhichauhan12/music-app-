package com.abhishek.musicapp.ui.fragments;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u001a\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/abhishek/musicapp/ui/fragments/TopTracksFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapterTopTracks", "Lcom/abhishek/musicapp/ui/adapters/AudioAdapter;", "homeViewModel", "Lcom/abhishek/musicapp/ui/viewmodels/HomeViewModel;", "getHomeViewModel", "()Lcom/abhishek/musicapp/ui/viewmodels/HomeViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "musicViewModel", "Lcom/abhishek/musicapp/ui/viewmodels/MusicViewModel;", "getMusicViewModel", "()Lcom/abhishek/musicapp/ui/viewmodels/MusicViewModel;", "musicViewModel$delegate", "topTracksFragment", "Lcom/abhishek/musicapp/databinding/FragmentTopTracksBinding;", "attachObservers", "", "initViews", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class TopTracksFragment extends androidx.fragment.app.Fragment {
    private com.abhishek.musicapp.databinding.FragmentTopTracksBinding topTracksFragment;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy homeViewModel$delegate = null;
    private com.abhishek.musicapp.ui.adapters.AudioAdapter adapterTopTracks;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy musicViewModel$delegate = null;
    
    public TopTracksFragment() {
        super();
    }
    
    private final com.abhishek.musicapp.ui.viewmodels.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    private final com.abhishek.musicapp.ui.viewmodels.MusicViewModel getMusicViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
    
    private final void attachObservers() {
    }
}