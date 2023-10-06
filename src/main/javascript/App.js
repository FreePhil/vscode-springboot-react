import React from 'react';
import ListOfVideos from './ListOfVideos';
import NewVideo from "./NewVideo";

export const App = function() {
  return (
    <div>
      <ListOfVideos />
      <NewVideo />
    </div>
  )
}