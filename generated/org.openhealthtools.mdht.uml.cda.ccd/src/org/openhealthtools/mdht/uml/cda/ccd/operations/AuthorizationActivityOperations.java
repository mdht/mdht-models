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
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Authorization Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity#validateAuthorizationActivityEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity#validateAuthorizationActivityEntryRelationshipTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Entry Relationship Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity#validateAuthorizationActivityHasPerformers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Has Performers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity#validateAuthorizationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity#validateAuthorizationActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity#validateAuthorizationActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity#validateAuthorizationActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity#validateAuthorizationActivityEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Entry Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthorizationActivityOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected AuthorizationActivityOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateAuthorizationActivityEntryRelationshipTypeCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Entry Relationship Type Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAuthorizationActivityEntryRelationshipTypeCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship.typeCode->exists( tc : vocab::x_ActRelationshipEntryRelationship | tc = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	* The cached OCL invariant for the '{@link #validateAuthorizationActivityEntryRelationshipTypeCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Entry Relationship Type Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAuthorizationActivityEntryRelationshipTypeCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param authorizationActivity The receiving '<em><b>Authorization Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateAuthorizationActivityEntryRelationshipTypeCode(
			AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.AUTHORIZATION_ACTIVITY);
			try {
				VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			authorizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_TYPE_CODE,
					CCDPlugin.INSTANCE.getString("AuthorizationActivityEntryRelationshipTypeCode"),
					new Object[] { authorizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateAuthorizationActivityEntryRelationshipTarget(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Entry Relationship Target</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAuthorizationActivityEntryRelationshipTarget(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->forAll(act.moodCode = vocab::x_DocumentActMood::PRMS) or  self.entryRelationship->forAll(encounter.moodCode = vocab::x_DocumentEncounterMood::PRMS) or self.entryRelationship->forAll(observation.moodCode = vocab::x_ActMoodDocumentObservation::PRMS) or  self.entryRelationship->forAll(observationMedia.moodCode = vocab::ActMood::PRMS) or self.entryRelationship->forAll(organizer.moodCode = vocab::ActMood::PRMS) or self.entryRelationship->forAll(procedure.moodCode = vocab::x_DocumentProcedureMood::PRMS) or  self.entryRelationship->forAll(regionOfInterest.moodCode = vocab::ActMood::PRMS) or self.entryRelationship->forAll(substanceAdministration.moodCode = vocab::x_DocumentSubstanceMood::PRMS) or  self.entryRelationship->forAll(supply.moodCode = vocab::x_DocumentSubstanceMood::PRMS)";

	/**
	* The cached OCL invariant for the '{@link #validateAuthorizationActivityEntryRelationshipTarget(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Entry Relationship Target</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAuthorizationActivityEntryRelationshipTarget(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param authorizationActivity The receiving '<em><b>Authorization Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateAuthorizationActivityEntryRelationshipTarget(
			AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.AUTHORIZATION_ACTIVITY);
			try {
				VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			authorizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP_TARGET,
					CCDPlugin.INSTANCE.getString("AuthorizationActivityEntryRelationshipTarget"),
					new Object[] { authorizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateAuthorizationActivityHasPerformers(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Has Performers</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAuthorizationActivityHasPerformers(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_AUTHORIZATION_ACTIVITY_HAS_PERFORMERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->forAll(not act.performer->isEmpty() ) or  self.entryRelationship->forAll(not encounter.performer->isEmpty()) or self.entryRelationship->forAll(not observation.performer->isEmpty()) or  self.entryRelationship->forAll(not observationMedia.performer->isEmpty()) or self.entryRelationship->forAll(not organizer.performer->isEmpty()) or self.entryRelationship->forAll(not procedure.performer->isEmpty()) or  self.entryRelationship->forAll(not regionOfInterest.performer->isEmpty()) or self.entryRelationship->forAll(not substanceAdministration.performer->isEmpty()) or  self.entryRelationship->forAll(not supply.performer->isEmpty())";

	/**
	* The cached OCL invariant for the '{@link #validateAuthorizationActivityHasPerformers(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Has Performers</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAuthorizationActivityHasPerformers(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_AUTHORIZATION_ACTIVITY_HAS_PERFORMERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param authorizationActivity The receiving '<em><b>Authorization Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateAuthorizationActivityHasPerformers(AuthorizationActivity authorizationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHORIZATION_ACTIVITY_HAS_PERFORMERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.AUTHORIZATION_ACTIVITY);
			try {
				VALIDATE_AUTHORIZATION_ACTIVITY_HAS_PERFORMERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTHORIZATION_ACTIVITY_HAS_PERFORMERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AUTHORIZATION_ACTIVITY_HAS_PERFORMERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			authorizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_HAS_PERFORMERS,
					CCDPlugin.INSTANCE.getString("AuthorizationActivityHasPerformers"),
					new Object[] { authorizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateAuthorizationActivityTemplateId(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAuthorizationActivityTemplateId(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_AUTHORIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.19')";

	/**
	* The cached OCL invariant for the '{@link #validateAuthorizationActivityTemplateId(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAuthorizationActivityTemplateId(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_AUTHORIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param authorizationActivity The receiving '<em><b>Authorization Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateAuthorizationActivityTemplateId(AuthorizationActivity authorizationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHORIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.AUTHORIZATION_ACTIVITY);
			try {
				VALIDATE_AUTHORIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTHORIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AUTHORIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			authorizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_TEMPLATE_ID,
					CCDPlugin.INSTANCE.getString("AuthorizationActivityTemplateId"),
					new Object[] { authorizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateAuthorizationActivityClassCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Class Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAuthorizationActivityClassCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_AUTHORIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	* The cached OCL invariant for the '{@link #validateAuthorizationActivityClassCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Class Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAuthorizationActivityClassCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_AUTHORIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param authorizationActivity The receiving '<em><b>Authorization Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateAuthorizationActivityClassCode(AuthorizationActivity authorizationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHORIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.AUTHORIZATION_ACTIVITY);
			try {
				VALIDATE_AUTHORIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTHORIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AUTHORIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			authorizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_CLASS_CODE,
					CCDPlugin.INSTANCE.getString("AuthorizationActivityClassCode"),
					new Object[] { authorizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateAuthorizationActivityMoodCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAuthorizationActivityMoodCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_AUTHORIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	* The cached OCL invariant for the '{@link #validateAuthorizationActivityMoodCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAuthorizationActivityMoodCode(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_AUTHORIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param authorizationActivity The receiving '<em><b>Authorization Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateAuthorizationActivityMoodCode(AuthorizationActivity authorizationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHORIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.AUTHORIZATION_ACTIVITY);
			try {
				VALIDATE_AUTHORIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTHORIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AUTHORIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			authorizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_MOOD_CODE,
					CCDPlugin.INSTANCE.getString("AuthorizationActivityMoodCode"),
					new Object[] { authorizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateAuthorizationActivityId(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAuthorizationActivityId(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_AUTHORIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	* The cached OCL invariant for the '{@link #validateAuthorizationActivityId(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAuthorizationActivityId(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_AUTHORIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param authorizationActivity The receiving '<em><b>Authorization Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateAuthorizationActivityId(AuthorizationActivity authorizationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHORIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.AUTHORIZATION_ACTIVITY);
			try {
				VALIDATE_AUTHORIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTHORIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AUTHORIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			authorizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_ID,
					CCDPlugin.INSTANCE.getString("AuthorizationActivityId"), new Object[] { authorizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateAuthorizationActivityEntryRelationship(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Entry Relationship</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAuthorizationActivityEntryRelationship(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(rim::ActRelationship))";

	/**
	* The cached OCL invariant for the '{@link #validateAuthorizationActivityEntryRelationship(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Entry Relationship</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateAuthorizationActivityEntryRelationship(AuthorizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param authorizationActivity The receiving '<em><b>Authorization Activity</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateAuthorizationActivityEntryRelationship(AuthorizationActivity authorizationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.AUTHORIZATION_ACTIVITY);
			try {
				VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			authorizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_ENTRY_RELATIONSHIP,
					CCDPlugin.INSTANCE.getString("AuthorizationActivityEntryRelationship"),
					new Object[] { authorizationActivity }));
			}

			return false;
		}
		return true;
	}

} // AuthorizationActivityOperations
