import http from "@/api";
import { Embedded } from "./interface";

export const getToken = () => {
  return http.get<Embedded.Token>(`/api/token`);
};

export const getSimulatedToken = () => {
  return http.get<Embedded.SimulatedToken>(`/simulated/token`);
};
