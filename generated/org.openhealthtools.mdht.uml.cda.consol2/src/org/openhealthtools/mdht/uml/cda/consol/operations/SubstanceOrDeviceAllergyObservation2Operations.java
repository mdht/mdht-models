/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Ai) - updated VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP as per errata 710
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
import org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.CriticalityObservation;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Substance Or Device Allergy Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2CriticalityInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Criticality Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2CriticalityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Criticality Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Allergy Specific Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Allergy Class Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Allergy Food Other Substance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#getConsolReactionObservation2s() <em>Get Consol Reaction Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#getConsolSeverityObservation2() <em>Get Consol Severity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#getCriticalityObservation() <em>Get Criticality Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#getConsolAllergyStatusObservation2() <em>Get Consol Allergy Status Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Allergy Status Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationSeverityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationAllergyStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Allergy Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity CE Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity CE Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstanceOrDeviceAllergyObservation2Operations extends SubstanceOrDeviceAllergyObservationOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceOrDeviceAllergyObservation2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2CriticalityInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Criticality Inversion Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2CriticalityInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_CRITICALITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::CriticalityObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2CriticalityInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Criticality Inversion Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2CriticalityInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_CRITICALITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservation2CriticalityInversionIndicator(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_CRITICALITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_CRITICALITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_CRITICALITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_CRITICALITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_CRITICALITY_INVERSION_INDICATOR,
						ConsolPlugin.INSTANCE.getString(
							"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservation2CriticalityInversionIndicator"),
						new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2TemplateId(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2TemplateId(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.24.3.90' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2TemplateId(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2TemplateId(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservation2TemplateId(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservation2TemplateId"),
						new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION,
						ConsolPlugin.INSTANCE.getString(
							"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservation2AuthorParticipation"),
						new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2CriticalityObservation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Criticality Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2CriticalityObservation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_CRITICALITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::CriticalityObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2CriticalityObservation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Criticality Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2CriticalityObservation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_CRITICALITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservation2CriticalityObservation(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_CRITICALITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_CRITICALITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_CRITICALITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_CRITICALITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_CRITICALITY_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservation2CriticalityObservation"),
						new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2IVLTSLow(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2IVLTSLow(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2IVLTSLow(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2IVLTSLow(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservation2IVLTSLow(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_LOW,
							ConsolPlugin.INSTANCE.getString(
								"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservation2IVLTSLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_HIGH,
							ConsolPlugin.INSTANCE.getString(
								"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservation2IVLTSHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Allergy Specific Medication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_SPECIFIC_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Allergy Specific Medication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_SPECIFIC_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_SPECIFIC_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_SPECIFIC_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_SPECIFIC_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_SPECIFIC_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_SPECIFIC_MEDICATION,
							ConsolPlugin.INSTANCE.getString(
								"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Allergy Class Medication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_CLASS_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Allergy Class Medication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_CLASS_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_CLASS_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_CLASS_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_CLASS_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_CLASS_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_CLASS_MEDICATION,
							ConsolPlugin.INSTANCE.getString(
								"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Allergy Food Other Substance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_FOOD_OTHER_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Allergy Food Other Substance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_FOOD_OTHER_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_FOOD_OTHER_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_FOOD_OTHER_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_FOOD_OTHER_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_FOOD_OTHER_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_FOOD_OTHER_SUBSTANCE,
							ConsolPlugin.INSTANCE.getString(
								"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolReactionObservation2s(SubstanceOrDeviceAllergyObservation2) <em>Get Consol Reaction Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolReactionObservation2s(SubstanceOrDeviceAllergyObservation2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_REACTION_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation2)).oclAsType(consol::ReactionObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolReactionObservation2s(SubstanceOrDeviceAllergyObservation2) <em>Get Consol Reaction Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolReactionObservation2s(SubstanceOrDeviceAllergyObservation2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_REACTION_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ReactionObservation2> getConsolReactionObservation2s(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2) {

		if (GET_CONSOL_REACTION_OBSERVATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2,
				ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2.getEAllOperations().get(93));
			try {
				GET_CONSOL_REACTION_OBSERVATION2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_REACTION_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_REACTION_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ReactionObservation2> result = (Collection<ReactionObservation2>) query.evaluate(
			substanceOrDeviceAllergyObservation2);
		return new BasicEList.UnmodifiableEList<ReactionObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolSeverityObservation2(SubstanceOrDeviceAllergyObservation2) <em>Get Consol Severity Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolSeverityObservation2(SubstanceOrDeviceAllergyObservation2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_SEVERITY_OBSERVATION2__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SeverityObservation2))->asSequence()->any(true).oclAsType(consol::SeverityObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolSeverityObservation2(SubstanceOrDeviceAllergyObservation2) <em>Get Consol Severity Observation2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolSeverityObservation2(SubstanceOrDeviceAllergyObservation2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_SEVERITY_OBSERVATION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static SeverityObservation2 getConsolSeverityObservation2(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2) {

		if (GET_CONSOL_SEVERITY_OBSERVATION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2,
				ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2.getEAllOperations().get(94));
			try {
				GET_CONSOL_SEVERITY_OBSERVATION2__EOCL_QRY = helper.createQuery(
					GET_CONSOL_SEVERITY_OBSERVATION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_SEVERITY_OBSERVATION2__EOCL_QRY);
		return (SeverityObservation2) query.evaluate(substanceOrDeviceAllergyObservation2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCriticalityObservation(SubstanceOrDeviceAllergyObservation2) <em>Get Criticality Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalityObservation(SubstanceOrDeviceAllergyObservation2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CRITICALITY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CriticalityObservation))->asSequence()->any(true).oclAsType(consol::CriticalityObservation)";

	/**
	 * The cached OCL query for the '{@link #getCriticalityObservation(SubstanceOrDeviceAllergyObservation2) <em>Get Criticality Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalityObservation(SubstanceOrDeviceAllergyObservation2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CRITICALITY_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static CriticalityObservation getCriticalityObservation(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2) {

		if (GET_CRITICALITY_OBSERVATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2,
				ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2.getEAllOperations().get(95));
			try {
				GET_CRITICALITY_OBSERVATION__EOCL_QRY = helper.createQuery(GET_CRITICALITY_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CRITICALITY_OBSERVATION__EOCL_QRY);
		return (CriticalityObservation) query.evaluate(substanceOrDeviceAllergyObservation2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolAllergyStatusObservation2(SubstanceOrDeviceAllergyObservation2) <em>Get Consol Allergy Status Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolAllergyStatusObservation2(SubstanceOrDeviceAllergyObservation2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_ALLERGY_STATUS_OBSERVATION2__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyStatusObservation2))->asSequence()->any(true).oclAsType(consol::AllergyStatusObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolAllergyStatusObservation2(SubstanceOrDeviceAllergyObservation2) <em>Get Consol Allergy Status Observation2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolAllergyStatusObservation2(SubstanceOrDeviceAllergyObservation2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_ALLERGY_STATUS_OBSERVATION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AllergyStatusObservation2 getConsolAllergyStatusObservation2(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2) {

		if (GET_CONSOL_ALLERGY_STATUS_OBSERVATION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2,
				ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2.getEAllOperations().get(96));
			try {
				GET_CONSOL_ALLERGY_STATUS_OBSERVATION2__EOCL_QRY = helper.createQuery(
					GET_CONSOL_ALLERGY_STATUS_OBSERVATION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_ALLERGY_STATUS_OBSERVATION2__EOCL_QRY);
		return (AllergyStatusObservation2) query.evaluate(substanceOrDeviceAllergyObservation2);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Inversion Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::ReactionObservation2))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Inversion Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR,
						ConsolPlugin.INSTANCE.getString(
							"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationReactionInversionIndicator"),
						new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Inversion Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::SeverityObservation2))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Inversion Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR,
						ConsolPlugin.INSTANCE.getString(
							"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationSeverityInversionIndicator"),
						new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Allergy Status Inversion Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::AllergyStatusObservation2))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Allergy Status Inversion Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR,
						ConsolPlugin.INSTANCE.getString(
							"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator"),
						new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationEffectiveTime(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationEffectiveTime(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationEffectiveTime(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationEffectiveTime(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationEffectiveTime(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationEffectiveTime"),
						new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationValueP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationValueP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationValueP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationValueP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationValueP(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE_P,
						ConsolPlugin.INSTANCE.getString(
							"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationValueP"),
						new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservationValueP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservationValueP", passToken);
				}
				passToken.add(substanceOrDeviceAllergyObservation2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '420134006' or value.code = '418038007' or value.code = '419511003' or value.code = '418471000' or value.code = '419199007' or value.code = '416098002' or value.code = '414285001' or value.code = '59037007' or value.code = '235719002' or value.code = '232347008' or value.code = '426232007')))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationValue(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservationValueP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(substanceOrDeviceAllergyObservation2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationValue"),
						new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationCodeP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationCodeP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationCodeP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationCodeP(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationCodeP(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationCodeP"),
						new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservationCodeP", passToken);
				}
				passToken.add(substanceOrDeviceAllergyObservation2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationCode(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationCode(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationCode(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationCode(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationCode(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(substanceOrDeviceAllergyObservation2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString(
							"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationCode"),
						new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipant(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipant(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipant(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipant(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationParticipant(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT,
						ConsolPlugin.INSTANCE.getString(
							"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipant"),
						new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationReactionObservation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationReactionObservation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationReactionObservation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationReactionObservation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationReactionObservation(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationReactionObservation"),
						new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationSeverityObservation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationSeverityObservation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SeverityObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationSeverityObservation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationSeverityObservation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationSeverityObservation(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationSeverityObservation"),
						new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationAllergyStatusObservation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Allergy Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationAllergyStatusObservation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AllergyStatusObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationAllergyStatusObservation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Allergy Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationAllergyStatusObservation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSubstanceOrDeviceAllergyObservationAllergyStatusObservation(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				substanceOrDeviceAllergyObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationAllergyStatusObservation"),
						new Object[] { substanceOrDeviceAllergyObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity CE Original Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((originalText.oclIsUndefined() or originalText.isNullFlavorUndefined()) implies (true) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity CE Original Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT,
							ConsolPlugin.INSTANCE.getString(
								"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity CE Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (true) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity CE Translation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION,
							ConsolPlugin.INSTANCE.getString(
								"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Original Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Original Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE,
							ConsolPlugin.INSTANCE.getString(
								"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE,
							ConsolPlugin.INSTANCE.getString(
								"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Original Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Original Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE,
							ConsolPlugin.INSTANCE.getString(
								"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE,
							ConsolPlugin.INSTANCE.getString(
								"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(SubstanceOrDeviceAllergyObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param substanceOrDeviceAllergyObservation2 The receiving '<em><b>Substance Or Device Allergy Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(
			SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			substanceOrDeviceAllergyObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2__SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE,
							ConsolPlugin.INSTANCE.getString(
								"SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRole"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // SubstanceOrDeviceAllergyObservation2Operations
