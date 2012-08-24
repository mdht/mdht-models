/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

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
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.ihe.Comment;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ihe.Severity;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Intolerance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceCodeCodeSystemRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Code Code System Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceDisplayNameCodeName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Display Name Code Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceAllergySubstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceAllergySubstanceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceAllergySubstanceParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceAllergySubstanceParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceAllergySubstancePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceAllergySubstancePlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceAllergySubstancePlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntolerancePlayingEntityCodeReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Playing Entity Code Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceProblemEntryReactionObservationContainer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Problem Entry Reaction Observation Container</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceProblemStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#validateAllergyIntoleranceComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#getProblemEntryReactionObservationContainers() <em>Get Problem Entry Reaction Observation Containers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#getIHESeverity() <em>Get IHE Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#getIHEProblemStatusObservation() <em>Get IHE Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance#getIHEComments() <em>Get IHE Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergyIntoleranceOperations extends ProblemEntryOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AllergyIntoleranceOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateAllergyIntoleranceCodeCodeSystemRequired(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Code Code System Required</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceCodeCodeSystemRequired(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_CODE_CODE_SYSTEM_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not (code.code.oclIsUndefined() or code.codeSystem.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateAllergyIntoleranceCodeCodeSystemRequired(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Code Code System Required</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceCodeCodeSystemRequired(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_CODE_CODE_SYSTEM_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateAllergyIntoleranceCodeCodeSystemRequired(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ALLERGY_INTOLERANCE_CODE_CODE_SYSTEM_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
      try
      {
        VALIDATE_ALLERGY_INTOLERANCE_CODE_CODE_SYSTEM_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_CODE_CODE_SYSTEM_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_CODE_CODE_SYSTEM_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_CODE_CODE_SYSTEM_REQUIRED,
             IHEPlugin.INSTANCE.getString("AllergyIntoleranceCodeCodeSystemRequired"),
             new Object [] { allergyIntolerance }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAllergyIntoleranceDisplayNameCodeName(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Display Name Code Name</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceDisplayNameCodeName(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_DISPLAY_NAME_CODE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not (code.displayName.oclIsUndefined() or code.codeSystemName.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateAllergyIntoleranceDisplayNameCodeName(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Display Name Code Name</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceDisplayNameCodeName(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_DISPLAY_NAME_CODE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateAllergyIntoleranceDisplayNameCodeName(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ALLERGY_INTOLERANCE_DISPLAY_NAME_CODE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
      try
      {
        VALIDATE_ALLERGY_INTOLERANCE_DISPLAY_NAME_CODE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_DISPLAY_NAME_CODE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_DISPLAY_NAME_CODE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_DISPLAY_NAME_CODE_NAME,
             IHEPlugin.INSTANCE.getString("AllergyIntoleranceDisplayNameCodeName"),
             new Object [] { allergyIntolerance }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAllergyIntoleranceAllergySubstance(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceAllergySubstance(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->size() = 1";

	/**
   * The cached OCL invariant for the '{@link #validateAllergyIntoleranceAllergySubstance(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceAllergySubstance(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateAllergyIntoleranceAllergySubstance(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
      try
      {
        VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE,
             IHEPlugin.INSTANCE.getString("AllergyIntoleranceAllergySubstance"),
             new Object [] { allergyIntolerance }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAllergyIntoleranceAllergySubstanceTypeCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance Type Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceAllergySubstanceTypeCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->forAll(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::CSM)";

	/**
   * The cached OCL invariant for the '{@link #validateAllergyIntoleranceAllergySubstanceTypeCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceAllergySubstanceTypeCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateAllergyIntoleranceAllergySubstanceTypeCode(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
      try
      {
        VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_TYPE_CODE,
             IHEPlugin.INSTANCE.getString("AllergyIntoleranceAllergySubstanceTypeCode"),
             new Object [] { allergyIntolerance }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAllergyIntoleranceAllergySubstanceParticipantRole(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance Participant Role</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceAllergySubstanceParticipantRole(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole->size() = 1";

	/**
   * The cached OCL invariant for the '{@link #validateAllergyIntoleranceAllergySubstanceParticipantRole(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance Participant Role</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceAllergySubstanceParticipantRole(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateAllergyIntoleranceAllergySubstanceParticipantRole(
			AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
      try
      {
        VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PARTICIPANT_ROLE,
             IHEPlugin.INSTANCE.getString("AllergyIntoleranceAllergySubstanceParticipantRole"),
             new Object [] { allergyIntolerance }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAllergyIntoleranceAllergySubstanceParticipantRoleClassCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance Participant Role Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceAllergySubstanceParticipantRoleClassCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole->one(pr : cda::ParticipantRole | pr.classCode = vocab::RoleClassRoot::MANU)";

	/**
   * The cached OCL invariant for the '{@link #validateAllergyIntoleranceAllergySubstanceParticipantRoleClassCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance Participant Role Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceAllergySubstanceParticipantRoleClassCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateAllergyIntoleranceAllergySubstanceParticipantRoleClassCode(
			AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
      try
      {
        VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PARTICIPANT_ROLE_CLASS_CODE,
             IHEPlugin.INSTANCE.getString("AllergyIntoleranceAllergySubstanceParticipantRoleClassCode"),
             new Object [] { allergyIntolerance }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAllergyIntoleranceAllergySubstancePlayingEntity(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance Playing Entity</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceAllergySubstancePlayingEntity(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.playingEntity->size() = 1";

	/**
   * The cached OCL invariant for the '{@link #validateAllergyIntoleranceAllergySubstancePlayingEntity(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance Playing Entity</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceAllergySubstancePlayingEntity(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateAllergyIntoleranceAllergySubstancePlayingEntity(
			AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
      try
      {
        VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY,
             IHEPlugin.INSTANCE.getString("AllergyIntoleranceAllergySubstancePlayingEntity"),
             new Object [] { allergyIntolerance }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAllergyIntoleranceAllergySubstancePlayingEntityClassCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance Playing Entity Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceAllergySubstancePlayingEntityClassCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.playingEntity->one(pe : cda::PlayingEntity | pe.classCode = vocab::EntityClassRoot::MMAT)";

	/**
   * The cached OCL invariant for the '{@link #validateAllergyIntoleranceAllergySubstancePlayingEntityClassCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance Playing Entity Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceAllergySubstancePlayingEntityClassCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateAllergyIntoleranceAllergySubstancePlayingEntityClassCode(
			AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
      try
      {
        VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY_CLASS_CODE,
             IHEPlugin.INSTANCE.getString("AllergyIntoleranceAllergySubstancePlayingEntityClassCode"),
             new Object [] { allergyIntolerance }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAllergyIntoleranceAllergySubstancePlayingEntityCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance Playing Entity Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceAllergySubstancePlayingEntityCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.playingEntity.code->size() = 1";

	/**
   * The cached OCL invariant for the '{@link #validateAllergyIntoleranceAllergySubstancePlayingEntityCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Allergy Substance Playing Entity Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceAllergySubstancePlayingEntityCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateAllergyIntoleranceAllergySubstancePlayingEntityCode(
			AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
      try
      {
        VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_ALLERGY_SUBSTANCE_PLAYING_ENTITY_CODE,
             IHEPlugin.INSTANCE.getString("AllergyIntoleranceAllergySubstancePlayingEntityCode"),
             new Object [] { allergyIntolerance }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAllergyIntolerancePlayingEntityCodeReference(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Playing Entity Code Reference</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntolerancePlayingEntityCodeReference(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_PLAYING_ENTITY_CODE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.playingEntity.code.originalText.reference->size() = 1";

	/**
   * The cached OCL invariant for the '{@link #validateAllergyIntolerancePlayingEntityCodeReference(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Playing Entity Code Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntolerancePlayingEntityCodeReference(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_PLAYING_ENTITY_CODE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateAllergyIntolerancePlayingEntityCodeReference(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ALLERGY_INTOLERANCE_PLAYING_ENTITY_CODE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
      try
      {
        VALIDATE_ALLERGY_INTOLERANCE_PLAYING_ENTITY_CODE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_PLAYING_ENTITY_CODE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_PLAYING_ENTITY_CODE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_PLAYING_ENTITY_CODE_REFERENCE,
             IHEPlugin.INSTANCE.getString("AllergyIntolerancePlayingEntityCodeReference"),
             new Object [] { allergyIntolerance }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAllergyIntoleranceTemplateId(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceTemplateId(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.6')";

	/**
   * The cached OCL invariant for the '{@link #validateAllergyIntoleranceTemplateId(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceTemplateId(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateAllergyIntoleranceTemplateId(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ALLERGY_INTOLERANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
      try
      {
        VALIDATE_ALLERGY_INTOLERANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_TEMPLATE_ID,
             IHEPlugin.INSTANCE.getString("AllergyIntoleranceTemplateId"),
             new Object [] { allergyIntolerance }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAllergyIntoleranceCodeP(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceCodeP(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ALLERGY_INTOLERANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateAllergyIntoleranceCodeP(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceCodeP(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAllergyIntoleranceCodeP(AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ALLERGY_INTOLERANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
      try
      {
        VALIDATE_ALLERGY_INTOLERANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_CODE_P,
             IHEPlugin.INSTANCE.getString("AllergyIntoleranceCodeP"),
             new Object [] { allergyIntolerance }));
      }
      
      if (context != null) {
        // generate a pass token for my dependent constraints to short-circuit or filter results
        @SuppressWarnings("unchecked")
        Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceCodeP");
        if (passToken == null) {
          // anticipate a reasonably healthy model
          passToken = new java.util.ArrayList<Object>(3);
          context.put("org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceCodeP", passToken);
        }
        passToken.add(allergyIntolerance);
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAllergyIntoleranceCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
   * The cached OCL invariant for the '{@link #validateAllergyIntoleranceCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceCode(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateAllergyIntoleranceCode(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceCodeP");
    if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(allergyIntolerance)) {
      // I have a free pass to short-circuit
      return true;
    }
  	  
    if (VALIDATE_ALLERGY_INTOLERANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
      try
      {
        VALIDATE_ALLERGY_INTOLERANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_CODE,
             IHEPlugin.INSTANCE.getString("AllergyIntoleranceCode"),
             new Object [] { allergyIntolerance }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAllergyIntoleranceValue(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Value</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceValue(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
   * The cached OCL invariant for the '{@link #validateAllergyIntoleranceValue(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceValue(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateAllergyIntoleranceValue(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ALLERGY_INTOLERANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
      try
      {
        VALIDATE_ALLERGY_INTOLERANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_VALUE,
             IHEPlugin.INSTANCE.getString("AllergyIntoleranceValue"),
             new Object [] { allergyIntolerance }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAllergyIntoleranceProblemEntryReactionObservationContainer(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Problem Entry Reaction Observation Container</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceProblemEntryReactionObservationContainer(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::ProblemEntryReactionObservationContainer) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)";

	/**
   * The cached OCL invariant for the '{@link #validateAllergyIntoleranceProblemEntryReactionObservationContainer(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Problem Entry Reaction Observation Container</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceProblemEntryReactionObservationContainer(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateAllergyIntoleranceProblemEntryReactionObservationContainer(
			AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
      try
      {
        VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER,
             IHEPlugin.INSTANCE.getString("AllergyIntoleranceProblemEntryReactionObservationContainer"),
             new Object [] { allergyIntolerance }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAllergyIntoleranceSeverity(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Severity</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceSeverity(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::Severity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
   * The cached OCL invariant for the '{@link #validateAllergyIntoleranceSeverity(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Severity</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceSeverity(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateAllergyIntoleranceSeverity(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ALLERGY_INTOLERANCE_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
      try
      {
        VALIDATE_ALLERGY_INTOLERANCE_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_SEVERITY,
             IHEPlugin.INSTANCE.getString("AllergyIntoleranceSeverity"),
             new Object [] { allergyIntolerance }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAllergyIntoleranceProblemStatusObservation(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Problem Status Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceProblemStatusObservation(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ihe::ProblemStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
   * The cached OCL invariant for the '{@link #validateAllergyIntoleranceProblemStatusObservation(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Problem Status Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceProblemStatusObservation(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateAllergyIntoleranceProblemStatusObservation(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
      try
      {
        VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_PROBLEM_STATUS_OBSERVATION,
             IHEPlugin.INSTANCE.getString("AllergyIntoleranceProblemStatusObservation"),
             new Object [] { allergyIntolerance }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateAllergyIntoleranceComment(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Comment</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceComment(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ALLERGY_INTOLERANCE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ihe::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
   * The cached OCL invariant for the '{@link #validateAllergyIntoleranceComment(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Comment</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAllergyIntoleranceComment(AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_ALLERGY_INTOLERANCE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param allergyIntolerance The receiving '<em><b>Allergy Intolerance</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateAllergyIntoleranceComment(AllergyIntolerance allergyIntolerance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ALLERGY_INTOLERANCE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(IHEPackage.Literals.ALLERGY_INTOLERANCE);
      try
      {
        VALIDATE_ALLERGY_INTOLERANCE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_INTOLERANCE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_INTOLERANCE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(allergyIntolerance))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             IHEValidator.DIAGNOSTIC_SOURCE,
             IHEValidator.ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_COMMENT,
             IHEPlugin.INSTANCE.getString("AllergyIntoleranceComment"),
             new Object [] { allergyIntolerance }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getProblemEntryReactionObservationContainers(AllergyIntolerance) <em>Get Problem Entry Reaction Observation Containers</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProblemEntryReactionObservationContainers(AllergyIntolerance)
   * @generated
   * @ordered
   */
	protected static final String GET_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINERS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemEntryReactionObservationContainer)).oclAsType(ihe::ProblemEntryReactionObservationContainer)";

	/**
   * The cached OCL query for the '{@link #getProblemEntryReactionObservationContainers(AllergyIntolerance) <em>Get Problem Entry Reaction Observation Containers</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProblemEntryReactionObservationContainers(AllergyIntolerance)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINERS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static EList<ProblemEntryReactionObservationContainer> getProblemEntryReactionObservationContainers(
			AllergyIntolerance allergyIntolerance) {
    if (GET_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINERS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(IHEPackage.Literals.ALLERGY_INTOLERANCE, IHEPackage.Literals.ALLERGY_INTOLERANCE.getEAllOperations().get(98));
      try
      {
        GET_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINERS__EOCL_QRY = helper.createQuery(GET_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINERS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINERS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<ProblemEntryReactionObservationContainer> result = (Collection<ProblemEntryReactionObservationContainer>) query.evaluate(allergyIntolerance);
    return new BasicEList.UnmodifiableEList<ProblemEntryReactionObservationContainer>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #getIHESeverity(AllergyIntolerance) <em>Get IHE Severity</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIHESeverity(AllergyIntolerance)
   * @generated
   * @ordered
   */
	protected static final String GET_IHE_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::Severity))->asSequence()->any(true).oclAsType(ihe::Severity)";

	/**
   * The cached OCL query for the '{@link #getIHESeverity(AllergyIntolerance) <em>Get IHE Severity</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIHESeverity(AllergyIntolerance)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_IHE_SEVERITY__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static Severity getIHESeverity(AllergyIntolerance allergyIntolerance) {
    if (GET_IHE_SEVERITY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(IHEPackage.Literals.ALLERGY_INTOLERANCE, IHEPackage.Literals.ALLERGY_INTOLERANCE.getEAllOperations().get(99));
      try
      {
        GET_IHE_SEVERITY__EOCL_QRY = helper.createQuery(GET_IHE_SEVERITY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_IHE_SEVERITY__EOCL_QRY);
    return (Severity) query.evaluate(allergyIntolerance);
  }

	/**
   * The cached OCL expression body for the '{@link #getIHEProblemStatusObservation(AllergyIntolerance) <em>Get IHE Problem Status Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIHEProblemStatusObservation(AllergyIntolerance)
   * @generated
   * @ordered
   */
	protected static final String GET_IHE_PROBLEM_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemStatusObservation))->asSequence()->any(true).oclAsType(ihe::ProblemStatusObservation)";

	/**
   * The cached OCL query for the '{@link #getIHEProblemStatusObservation(AllergyIntolerance) <em>Get IHE Problem Status Observation</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIHEProblemStatusObservation(AllergyIntolerance)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_IHE_PROBLEM_STATUS_OBSERVATION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static ProblemStatusObservation getIHEProblemStatusObservation(AllergyIntolerance allergyIntolerance) {
    if (GET_IHE_PROBLEM_STATUS_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(IHEPackage.Literals.ALLERGY_INTOLERANCE, IHEPackage.Literals.ALLERGY_INTOLERANCE.getEAllOperations().get(100));
      try
      {
        GET_IHE_PROBLEM_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_IHE_PROBLEM_STATUS_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_IHE_PROBLEM_STATUS_OBSERVATION__EOCL_QRY);
    return (ProblemStatusObservation) query.evaluate(allergyIntolerance);
  }

	/**
   * The cached OCL expression body for the '{@link #getIHEComments(AllergyIntolerance) <em>Get IHE Comments</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIHEComments(AllergyIntolerance)
   * @generated
   * @ordered
   */
	protected static final String GET_IHE_COMMENTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::Comment)).oclAsType(ihe::Comment)";

	/**
   * The cached OCL query for the '{@link #getIHEComments(AllergyIntolerance) <em>Get IHE Comments</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIHEComments(AllergyIntolerance)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_IHE_COMMENTS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static EList<Comment> getIHEComments(AllergyIntolerance allergyIntolerance) {
    if (GET_IHE_COMMENTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(IHEPackage.Literals.ALLERGY_INTOLERANCE, IHEPackage.Literals.ALLERGY_INTOLERANCE.getEAllOperations().get(101));
      try
      {
        GET_IHE_COMMENTS__EOCL_QRY = helper.createQuery(GET_IHE_COMMENTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_IHE_COMMENTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<Comment> result = (Collection<Comment>) query.evaluate(allergyIntolerance);
    return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
  }

} // AllergyIntoleranceOperations
