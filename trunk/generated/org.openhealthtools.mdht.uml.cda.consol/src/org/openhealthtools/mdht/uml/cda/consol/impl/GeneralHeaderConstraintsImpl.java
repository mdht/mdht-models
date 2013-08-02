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
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Header Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GeneralHeaderConstraintsImpl extends ClinicalDocumentImpl implements GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralHeaderConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsTypeIdRoot(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTypeIdRoot(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsTypeIdExtension(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTypeIdExtension(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsSetIdVersionNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsSetIdVersionNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsVersionNumberSetId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsVersionNumberSetId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRealmCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsTypeId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTypeId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsConfidentialityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConfidentialityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsConfidentialityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConfidentialityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLanguageCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsSetId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsSetId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsVersionNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsVersionNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEnterer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEnterer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodian(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodian(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTarget(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsComponentOf(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsSupportParticipant(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsSupportParticipant(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInFulfillmentOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInFulfillmentOf(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDocumentationOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOf(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCountry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressPostalCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressState(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUseP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameFamily(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameFamily(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameGiven(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameGiven(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNamePrefix(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNamePrefix(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameSuffix(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameSuffix(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUseP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUse(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCountry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressPostalCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressState(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUseP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressState(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorHasOneAssignedPersonOrOneAssignedAuthoringDevice(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorHasOneAssignedPersonOrOneAssignedAuthoringDevice(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorAssignedAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDataEntererAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressState(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCustodianAssignedCustodian(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodian(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorSignatureCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorSignatureCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressState(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsInformantAssignedEntityPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsInformantAssignedEntityPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantRelatedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantRelatedEntityPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInformantRelatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsParticipantSupportTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsParticipantSupportTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInFulfillmentOfOrderId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInFulfillmentOfOrderId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsInFulfillmentOfOrder(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInFulfillmentOfOrder(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsDocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEvent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorizationConsentCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorizationConsentCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorizationConsentId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorizationConsentId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthorizationConsent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorizationConsent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // GeneralHeaderConstraintsImpl
