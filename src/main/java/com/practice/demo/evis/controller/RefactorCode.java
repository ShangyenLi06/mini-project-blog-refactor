//package com.practice.demo.evis.controller;
//
//public class RefactorCode {
//
//    public void updatePlayer(StratumParamDto paramDto, User loginUser) throws GeneralException {
//
//        Stratum originStratum = findById(paramDto.getId());
//
//        String originStratumName = originStratum.getStratumName();
//        Integer originSortValue = originStratum.getSortValue();
//        Integer originConditionNumberOfDeposit = originStratum.getConditionNumberOfDeposit();
//        BigDecimal originConditionTotal
//         DepositAmount = originStratum.getConditionTotalDepositAmount();
//        BigDecimal originConditionDepositMaxLimitAmount = originStratum.getConditionDepositMaxLimitAmount();
//        Integer originConditionNumberOfWithdrawal = originStratum.getConditionNumberOfWithdrawal();
//        BigDecimal originConditionTotalWithdrawalAmount = originStratum.getConditionTotalWithdrawalAmount();
//        java.sql.Date originConditionCreateStartTime = originStratum.getConditionCreateStartTime();
//        java.sql.Date originConditionCreateEndTime = originStratum.getConditionCreateEndTime();
//
//        StringBuilder msg = new StringBuilder("");
//
//        String newStratumName = paramDto.getStratumName();
//        Integer newSortValue = paramDto.getSortValue();
//        Integer newConditionNumberOfDeposit = paramDto.getConditionNumberOfDeposit();
//        BigDecimal newConditionTotalDepositAmount = paramDto.getConditionTotalDepositAmount();
//        BigDecimal newConditionDepositMaxLimitAmount = paramDto.getConditionDepositMaxLimitAmount();
//        Integer newConditionNumberOfWithdrawal = paramDto.getConditionNumberOfWithdrawal();
//        BigDecimal newConditionTotalWithdrawalAmount = paramDto.getConditionTotalWithdrawalAmount();
//        java.sql.Date newConditionCreateStartTime = paramDto.getConditionCreateStartTime();
//        java.sql.Date newConditionCreateEndTime = paramDto.getConditionCreateEndTime();
//
//        originStratum.setStratumName(newStratumName);
//
//        if (1 != paramDto.getId()) {
//            originStratum.setSortValue(newSortValue);
//        }
//        originStratum.setConditionNumberOfDeposit(newConditionNumberOfDeposit);
//        originStratum.setConditionTotalDepositAmount(newConditionTotalDepositAmount);
//        originStratum.setConditionDepositMaxLimitAmount(newConditionDepositMaxLimitAmount);
//        originStratum.setConditionNumberOfWithdrawal(newConditionNumberOfWithdrawal);
//        originStratum.setConditionTotalWithdrawalAmount(newConditionTotalWithdrawalAmount);
//        originStratum.setConditionCreateStartTime(newConditionCreateStartTime);
//        originStratum.setConditionCreateEndTime(newConditionCreateEndTime);
//
//        if (!originStratumName.equalsIgnoreCase(newStratumName)) {
//            msg.append(" 层级名称: ").append(originStratumName).append("改为").append(newStratumName).append(" ");
//        }
//
//        if (originSortValue != null && 1 == originSortValue && !originSortValue.equals(newSortValue)) {
//            msg.append(" 排序: ").append(originSortValue).append("改为").append(newSortValue).append(" ");
//        }
//
//        if (originConditionNumberOfDeposit != null && !originConditionNumberOfDeposit.equals(newConditionNumberOfDeposit)) {
//            msg.append(" 分层条件存款次数: ").append(originConditionNumberOfDeposit).append("改为").append(newConditionNumberOfDeposit).append(" ");
//        }
//
//        if (originConditionTotalDepositAmount != null && originConditionTotalDepositAmount.compareTo(newConditionTotalDepositAmount) != 0) {
//            msg.append(" 分层条件存款总额: ").append(originConditionTotalDepositAmount).append("改为").append(newConditionTotalDepositAmount).append(" ");
//        }
//
//        if (originConditionDepositMaxLimitAmount != null && originConditionDepositMaxLimitAmount.compareTo(newConditionDepositMaxLimitAmount) != 0) {
//            msg.append(" 分层条件最大存款额度: ").append(originConditionDepositMaxLimitAmount).append("改为").append(newConditionDepositMaxLimitAmount).append(" ");
//        }
//
//        if (originConditionNumberOfWithdrawal != null && !originConditionNumberOfWithdrawal.equals(newConditionNumberOfWithdrawal)) {
//            msg.append(" 分层条件提款次数: ").append(originConditionNumberOfWithdrawal).append("改为").append(newConditionNumberOfWithdrawal).append(" ");
//        }
//
//        if (originConditionTotalWithdrawalAmount != null && originConditionTotalWithdrawalAmount.compareTo(newConditionTotalWithdrawalAmount) != 0) {
//            msg.append(" 分层条件提款总额: ").append(originConditionTotalWithdrawalAmount).append("改为").append(newConditionTotalWithdrawalAmount).append(" ");
//        }
//
//        if (originConditionCreateStartTime != null && originConditionCreateStartTime.compareTo(newConditionCreateStartTime) != 0) {
//            msg.append(" 分层条件最大存款额度: ").append(originConditionCreateStartTime).append("改为").append(newConditionCreateStartTime).append(" ");
//        }
//
//        if (originConditionCreateEndTime != null && originConditionCreateEndTime.compareTo(newConditionCreateEndTime) != 0) {
//            msg.append(" 分层条件最大存款额度: ").append(originConditionCreateEndTime).append("改为").append(newConditionCreateEndTime).append(" ");
//        }
//
//        stratumRepository.save(originStratum);
//
//        if (msg.length() > 0) {
//            msg.insert(0, "层级名称(" + newStratumName + ")修改: ");
//            translogservice.addTransLog(TransLogsEnum.STRATUM, msg.toString(), loginUser);
//        }
//        log.info(msg.toString());
//    }
//
//}
//
//
