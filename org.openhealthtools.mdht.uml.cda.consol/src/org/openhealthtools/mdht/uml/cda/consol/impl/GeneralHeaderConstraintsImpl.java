/*******************************************************************************
 * Copyright (c) 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

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
	public boolean validateGeneralHeaderConstraintsPersonHasName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsPersonHasName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsTimePreciseToDay(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTimePreciseToDay(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsTimePreciseToYear(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTimePreciseToYear(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsTelephoneMatchesRegex(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTelephoneMatchesRegex(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsHasTelephoneDialingDigits(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasTelephoneDialingDigits(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(
			this, diagnostics, context);
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
	public boolean validateGeneralHeaderConstraintsOidLength(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsOidLength(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsSetIdAndVersionNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsSetIdAndVersionNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsSetIdAndIdAreUnique(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsSetIdAndIdAreUnique(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsCopyTimeNotPresent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCopyTimeNotPresent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsHasRecordTargetPatientRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasRecordTargetPatientRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsHasPatientBirthTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasPatientBirthTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsHasAdministrativeGenderCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasAdministrativeGenderCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsHasProviderOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasProviderOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsHasAuthorTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasAuthorTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsHasAssignedAuthorId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasAssignedAuthorId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsHasDataEntererTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasDataEntererTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsHasInformant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasInformant(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsTimePreciseToMinute(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTimePreciseToMinute(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsTimePreciseToYearAndDay(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTimePreciseToYearAndDay(
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
	public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
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
	public boolean validateGeneralHeaderConstraintsId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsId(this, diagnostics, context);
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
	public boolean validateGeneralHeaderConstraintsRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRealmCode(this, diagnostics, context);
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
	public boolean validateGeneralHeaderConstraintsTypeId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTypeId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints init() {
		CDAUtil.init(this);
		return this;
	}
} // GeneralHeaderConstraintsImpl
