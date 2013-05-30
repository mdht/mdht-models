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
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.OrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerFamilyHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Family History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person Administrative Gender Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person SDTC Deceased Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person SDTC Deceased Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person SDTC Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubjectSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubjectRelatedSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#getFamilyHistoryObservations() <em>Get Family History Observations</em>}</li>
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
	* The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.45')";

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
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
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
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerTemplateId"),
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
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
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
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerClassCode"),
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
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
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
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerMoodCode"),
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
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::FamilyHistoryObservation))";

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
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
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
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerFamilyHistoryObservation"),
					new Object[] { familyHistoryOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject</em>}' operation.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->one(subject : cda::Subject | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::Subject))";

	/**
	* The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateFamilyHistoryOrganizerSubject(FamilyHistoryOrganizer familyHistoryOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_SUBJECT,
					ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerSubject"),
					new Object[] { familyHistoryOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person Administrative Gender Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined() and administrativeGenderCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = administrativeGenderCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.1' and (value.code = 'F' or value.code = 'M' or value.code = 'UN')))";

	/**
	* The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person Administrative Gender Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCode(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(familyHistoryOrganizer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_ADMINISTRATIVE_GENDER_CODE,
						ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeP(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person Administrative Gender Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeP(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeP(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person Administrative Gender Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeP(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeP(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(familyHistoryOrganizer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_ADMINISTRATIVE_GENDER_CODE_P,
						ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonAdministrativeGenderCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTime(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person Birth Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTime(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTime(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person Birth Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTime(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTime(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(familyHistoryOrganizer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_BIRTH_TIME,
						ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonBirthTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedInd(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person SDTC Deceased Ind</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedInd(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_DECEASED_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((sDTCDeceasedInd.oclIsUndefined() or sDTCDeceasedInd.isNullFlavorUndefined()) implies (not sDTCDeceasedInd.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedInd(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person SDTC Deceased Ind</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedInd(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_DECEASED_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedInd(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_DECEASED_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_DECEASED_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_DECEASED_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_DECEASED_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(familyHistoryOrganizer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_DECEASED_IND,
						ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedInd"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTime(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person SDTC Deceased Time</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTime(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_DECEASED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((sDTCDeceasedTime.oclIsUndefined() or sDTCDeceasedTime.isNullFlavorUndefined()) implies (not sDTCDeceasedTime.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTime(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person SDTC Deceased Time</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTime(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_DECEASED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTime(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_DECEASED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_DECEASED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_DECEASED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_DECEASED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(familyHistoryOrganizer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_DECEASED_TIME,
						ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCDeceasedTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person SDTC Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((sDTCId->isEmpty() or sDTCId->exists(element | element.isNullFlavorUndefined())) implies (not sDTCId->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject Person SDTC Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCId(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(familyHistoryOrganizer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT_PERSON_SDTC_ID,
						ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerSubjectRelatedSubjectSubjectPersonSDTCId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectClassCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Class Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectClassCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null)->reject(classCode=vocab::x_DocumentSubject::PRS)";

	/**
	* The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectClassCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Class Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectClassCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectClassCode(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(familyHistoryOrganizer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerSubjectRelatedSubjectClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.111' and (value.code = 'ADOPT' or value.code = 'AUNT' or value.code = 'CHILD' or value.code = 'CHLDINLAW' or value.code = 'COUSN' or value.code = 'DOMPART' or value.code = 'FAMMEMB' or value.code = 'CHLDFOST' or value.code = 'GRNDCHILD' or value.code = 'GPARNT' or value.code = 'GRPRN' or value.code = 'GGRPRN' or value.code = 'HSIB' or value.code = 'MAUNT' or value.code = 'MCOUSN' or value.code = 'MGRPRN' or value.code = 'MGGRPRN' or value.code = 'MUNCLE' or value.code = 'NCHILD' or value.code = 'NPRN' or value.code = 'NSIB' or value.code = 'NIENEPH' or value.code = 'PRN' or value.code = 'PRNINLAW' or value.code = 'PAUNT' or value.code = 'PCOUSN' or value.code = 'PGRPRN' or value.code = 'PGGRPRN' or value.code = 'PUNCLE' or value.code = 'SIB' or value.code = 'SIBINLAW' or value.code = 'SIGOTHR' or value.code = 'SPS' or value.code = 'STEP' or value.code = 'STPPRN' or value.code = 'STPSIB' or value.code = 'UNCLE')))";

	/**
	* The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectCode(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(familyHistoryOrganizer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CODE,
						ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerSubjectRelatedSubjectCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectCodeP(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectCodeP(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectCodeP(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectCodeP(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectCodeP(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(familyHistoryOrganizer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_CODE_P,
						ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerSubjectRelatedSubjectCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null)->reject(subject->one(subject : cda::SubjectPerson | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::SubjectPerson)))";

	/**
	* The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject Subject</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubjectSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateFamilyHistoryOrganizerSubjectRelatedSubjectSubject(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(familyHistoryOrganizer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT_SUBJECT,
						ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerSubjectRelatedSubjectSubject"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null)->reject(relatedSubject->one(relatedSubject : cda::RelatedSubject | not relatedSubject.oclIsUndefined() and relatedSubject.oclIsKindOf(cda::RelatedSubject)))";

	/**
	* The cached OCL invariant for the '{@link #validateFamilyHistoryOrganizerSubjectRelatedSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject Related Subject</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateFamilyHistoryOrganizerSubjectRelatedSubject(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateFamilyHistoryOrganizerSubjectRelatedSubject(
			FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(familyHistoryOrganizer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_SUBJECT_RELATED_SUBJECT,
						ConsolPlugin.INSTANCE.getString("FamilyHistoryOrganizerSubjectRelatedSubject"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
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
	protected static final String GET_FAMILY_HISTORY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FamilyHistoryObservation)).oclAsType(consol::FamilyHistoryObservation)";

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
	* @generated
	*/
	public static EList<FamilyHistoryObservation> getFamilyHistoryObservations(
			FamilyHistoryOrganizer familyHistoryOrganizer) {
		if (GET_FAMILY_HISTORY_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER,
				ConsolPackage.Literals.FAMILY_HISTORY_ORGANIZER.getEAllOperations().get(68));
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
