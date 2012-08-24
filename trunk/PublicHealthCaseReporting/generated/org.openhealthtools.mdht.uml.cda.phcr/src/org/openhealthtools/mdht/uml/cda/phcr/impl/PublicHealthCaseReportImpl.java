/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PublicHealthCaseReportOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Health Case Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PublicHealthCaseReportImpl extends ClinicalDocumentImpl implements PublicHealthCaseReport {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PublicHealthCaseReportImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return PhcrPackage.Literals.PUBLIC_HEALTH_CASE_REPORT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPHCRRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRRecordTarget(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPHCRRecordTargetPatientRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRRecordTargetPatientRole(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPHCRAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRAuthor(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPHCRAuthorTiime(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRAuthorTiime(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPHCRLegalAuthenticator(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRLegalAuthenticator(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportCodeP(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPhcrSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPhcrSocialHistorySection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPhcrClinicalInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPhcrClinicalInformationSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPhcrTreatmentInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPhcrTreatmentInformationSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPhcrEncountersSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPhcrEncountersSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportPhcrRelevantDxTestsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPhcrRelevantDxTestsSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePublicHealthCaseReportImmunizationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return PublicHealthCaseReportOperations.validatePublicHealthCaseReportImmunizationsSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhcrSocialHistorySection getPhcrSocialHistorySection() {
    return PublicHealthCaseReportOperations.getPhcrSocialHistorySection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhcrClinicalInformationSection getPhcrClinicalInformationSection() {
    return PublicHealthCaseReportOperations.getPhcrClinicalInformationSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhcrTreatmentInformationSection getPhcrTreatmentInformationSection() {
    return PublicHealthCaseReportOperations.getPhcrTreatmentInformationSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhcrEncountersSection getPhcrEncountersSection() {
    return PublicHealthCaseReportOperations.getPhcrEncountersSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhcrRelevantDxTestsSection getPhcrRelevantDxTestsSection() {
    return PublicHealthCaseReportOperations.getPhcrRelevantDxTestsSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ImmunizationsSection getImmunizationsSection() {
    return PublicHealthCaseReportOperations.getImmunizationsSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PublicHealthCaseReport init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PublicHealthCaseReport init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //PublicHealthCaseReportImpl
