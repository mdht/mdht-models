/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity;
import org.openhealthtools.mdht.uml.cda.consol.operations.PolicyActivityOperations;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PolicyActivityImpl extends ActImpl implements PolicyActivity {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected PolicyActivityImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.POLICY_ACTIVITY;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityClassCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityMoodCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityStatusCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayer(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityGuarantor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityGuarantor(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverage(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverage(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityHolder(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityHolder(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityEntryRelationship(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressStreet(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressStreet(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressCity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressCity(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressCountry(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressCountry(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressPostalCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressPostalCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressState(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressState(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressStreetAddressLine(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressUseP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressUseP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressUse(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityUSRealmAddressUse(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayerPayerAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayerPayerAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayerPayerAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayerPayerAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityAddr(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayerPayerAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityTelecom(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayerTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerTypeCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityPayerPayerAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntity(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreet(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCity(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressCountry(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressPostalCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressState(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressStreetAddressLine(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUseP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUse(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityUSRealmAddressUse(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityGuarantorGuarantorAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityGuarantorGuarantorAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityCodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityGuarantorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityGuarantorTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityGuarantorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityGuarantorTime(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityGuarantorTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityGuarantorTypeCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityGuarantorGuarantorAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntity(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressStreet(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleUSRealmAddressStreet(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressCity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleUSRealmAddressCity(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressCountry(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleUSRealmAddressCountry(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressPostalCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleUSRealmAddressPostalCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressState(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleUSRealmAddressState(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleUSRealmAddressStreetAddressLine(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressUseP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleUSRealmAddressUseP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageCoverageRoleUSRealmAddressUse(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleUSRealmAddressUse(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageCoverageRoleId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageCoverageRoleCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageCoverageRoleCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageCoverageRoleAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleAddr(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageLowTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageLowTime(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageHighTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageHighTime(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageTypeCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageTime(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityCoverageCoverageRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRole(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityHolderHolderRoleUSRealmAddressStreet(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleUSRealmAddressStreet(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityHolderHolderRoleUSRealmAddressCity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleUSRealmAddressCity(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityHolderHolderRoleUSRealmAddressCountry(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleUSRealmAddressCountry(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityHolderHolderRoleUSRealmAddressPostalCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleUSRealmAddressPostalCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityHolderHolderRoleUSRealmAddressState(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleUSRealmAddressState(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityHolderHolderRoleUSRealmAddressStreetAddressLine(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleUSRealmAddressStreetAddressLine(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityHolderHolderRoleUSRealmAddressUseP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleUSRealmAddressUseP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityHolderHolderRoleUSRealmAddressUse(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleUSRealmAddressUse(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityHolderHolderRoleId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityHolderHolderRoleAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleAddr(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityHolderTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityHolderTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityHolderTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityHolderTypeCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityHolderTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityHolderTime(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityHolderHolderRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityHolderHolderRole(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityEntryRelationshipTargetActActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityEntryRelationshipTargetActActivity(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityEntryRelationshipDescriptionCoveragePlan(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityEntryRelationshipDescriptionCoveragePlan(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePolicyActivityEntryRelationshipTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PolicyActivityOperations.validatePolicyActivityEntryRelationshipTypeCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PolicyActivity init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PolicyActivityImpl
