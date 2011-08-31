/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.OrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerRelatedSubjectBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Related Subject Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerFamilyHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Family History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer#getFamilyHistoryObservations() <em>Get Family History Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryOrganizerOperations extends OrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistoryOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerRelatedSubjectBirthTime(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Related Subject Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerRelatedSubjectBirthTime(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.subject.relatedSubject.subject.birthTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerRelatedSubjectBirthTime(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Related Subject Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerRelatedSubjectBirthTime(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.subject.relatedSubject.subject.birthTime.oclIsUndefined()
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerRelatedSubjectBirthTime(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_BIRTH_TIME,
					CCDPlugin.INSTANCE.getString("FamilyHistoryOrganizerRelatedSubjectBirthTime"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.23')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.23')
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer familyHistoryOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID,
					CCDPlugin.INSTANCE.getString("FamilyHistoryOrganizerTemplateId"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerStatusCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerStatusCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("
			+ "value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerStatusCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerStatusCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerStatusCode(FamilyHistoryOrganizer familyHistoryOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_STATUS_CODE,
					CCDPlugin.INSTANCE.getString("FamilyHistoryOrganizerStatusCode"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerClassCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerClassCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerClassCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerClassCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerClassCode(FamilyHistoryOrganizer familyHistoryOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_CLASS_CODE,
					CCDPlugin.INSTANCE.getString("FamilyHistoryOrganizerClassCode"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerMoodCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerMoodCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::ActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerMoodCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerMoodCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::ActMood::EVN
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerMoodCode(FamilyHistoryOrganizer familyHistoryOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_MOOD_CODE,
					CCDPlugin.INSTANCE.getString("FamilyHistoryOrganizerMoodCode"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerFamilyHistoryObservation(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Family History Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerFamilyHistoryObservation(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(ccd::FamilyHistoryObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerFamilyHistoryObservation(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Family History Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryOrganizerFamilyHistoryObservation(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(ccd::FamilyHistoryObservation))
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryOrganizerFamilyHistoryObservation(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION,
					CCDPlugin.INSTANCE.getString("FamilyHistoryOrganizerFamilyHistoryObservation"),
					new Object[] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistoryObservations(FamilyHistoryOrganizer) <em>Get Family History Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistoryObservations(FamilyHistoryOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::FamilyHistoryObservation)).oclAsType(ccd::FamilyHistoryObservation)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistoryObservations(FamilyHistoryOrganizer) <em>Get Family History Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistoryObservations(FamilyHistoryOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::FamilyHistoryObservation)).oclAsType(ccd::FamilyHistoryObservation)
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<FamilyHistoryObservation> getFamilyHistoryObservations(
			FamilyHistoryOrganizer familyHistoryOrganizer) {
		if (GET_FAMILY_HISTORY_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CCDPackage.Literals.FAMILY_HISTORY_ORGANIZER,
				CCDPackage.Literals.FAMILY_HISTORY_ORGANIZER.getEAllOperations().get(56));
			try {
				GET_FAMILY_HISTORY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FamilyHistoryObservation> result = (Collection<FamilyHistoryObservation>) query.evaluate(familyHistoryOrganizer);
		return new BasicEList.UnmodifiableEList<FamilyHistoryObservation>(result.size(), result.toArray());
	}

} // FamilyHistoryOrganizerOperations
