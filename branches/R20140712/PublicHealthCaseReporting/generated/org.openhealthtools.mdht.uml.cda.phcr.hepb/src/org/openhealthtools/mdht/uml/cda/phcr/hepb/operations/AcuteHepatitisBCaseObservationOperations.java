/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.hepb.operations;

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
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.util.HepbValidator;
import org.openhealthtools.mdht.uml.cda.phcr.operations.CaseObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BCase Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation#validateAcuteHepatitisBCaseObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation#validateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Observation Acute Hepatitis BSigns And Symptoms Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation#getAcuteHepatitisBSignsAndSymptomsObservations() <em>Get Acute Hepatitis BSigns And Symptoms Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcuteHepatitisBCaseObservationOperations extends CaseObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcuteHepatitisBCaseObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBCaseObservationValue(AcuteHepatitisBCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBCaseObservationValue(AcuteHepatitisBCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_ACUTE_HEPATITIS_BCASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '13265006' or value.code = '186624004' or value.code = '186626002' or value.code = '424099008' or value.code = '235864009' or value.code = '76795007')))";

  /**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBCaseObservationValue(AcuteHepatitisBCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBCaseObservationValue(AcuteHepatitisBCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_ACUTE_HEPATITIS_BCASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '13265006' or value.code = '186624004' or value.code = '186626002' or value.code = '424099008' or value.code = '235864009' or value.code = '76795007')))
	 * @param acuteHepatitisBCaseObservation The receiving '<em><b>Acute Hepatitis BCase Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateAcuteHepatitisBCaseObservationValue(AcuteHepatitisBCaseObservation acuteHepatitisBCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BCASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_OBSERVATION);
			try {
				VALIDATE_ACUTE_HEPATITIS_BCASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BCASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BCASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBCaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BCASE_OBSERVATION__ACUTE_HEPATITIS_BCASE_OBSERVATION_VALUE,
						 HepbPlugin.INSTANCE.getString("AcuteHepatitisBCaseObservationValue"),
						 new Object [] { acuteHepatitisBCaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation(AcuteHepatitisBCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Observation Acute Hepatitis BSigns And Symptoms Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation(AcuteHepatitisBCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BCASE_OBSERVATION_ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(hepb::AcuteHepatitisBSignsAndSymptomsObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation(AcuteHepatitisBCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Observation Acute Hepatitis BSigns And Symptoms Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation(AcuteHepatitisBCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BCASE_OBSERVATION_ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(hepb::AcuteHepatitisBSignsAndSymptomsObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)
	 * @param acuteHepatitisBCaseObservation The receiving '<em><b>Acute Hepatitis BCase Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation(AcuteHepatitisBCaseObservation acuteHepatitisBCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BCASE_OBSERVATION_ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_OBSERVATION);
			try {
				VALIDATE_ACUTE_HEPATITIS_BCASE_OBSERVATION_ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BCASE_OBSERVATION_ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BCASE_OBSERVATION_ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBCaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BCASE_OBSERVATION__ACUTE_HEPATITIS_BCASE_OBSERVATION_ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION,
						 HepbPlugin.INSTANCE.getString("AcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation"),
						 new Object [] { acuteHepatitisBCaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAcuteHepatitisBSignsAndSymptomsObservations(AcuteHepatitisBCaseObservation) <em>Get Acute Hepatitis BSigns And Symptoms Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBSignsAndSymptomsObservations(AcuteHepatitisBCaseObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::AcuteHepatitisBSignsAndSymptomsObservation)).oclAsType(hepb::AcuteHepatitisBSignsAndSymptomsObservation)";

	/**
	 * The cached OCL query for the '{@link #getAcuteHepatitisBSignsAndSymptomsObservations(AcuteHepatitisBCaseObservation) <em>Get Acute Hepatitis BSigns And Symptoms Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBSignsAndSymptomsObservations(AcuteHepatitisBCaseObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::AcuteHepatitisBSignsAndSymptomsObservation)).oclAsType(hepb::AcuteHepatitisBSignsAndSymptomsObservation)
	 * @param acuteHepatitisBCaseObservation The receiving '<em><b>Acute Hepatitis BCase Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<AcuteHepatitisBSignsAndSymptomsObservation> getAcuteHepatitisBSignsAndSymptomsObservations(AcuteHepatitisBCaseObservation acuteHepatitisBCaseObservation) {
		if (GET_ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_OBSERVATION, HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_OBSERVATION.getEAllOperations().get(79));
			try {
				GET_ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AcuteHepatitisBSignsAndSymptomsObservation> result = (Collection<AcuteHepatitisBSignsAndSymptomsObservation>) query.evaluate(acuteHepatitisBCaseObservation);
		return new BasicEList.UnmodifiableEList<AcuteHepatitisBSignsAndSymptomsObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationTemplateId(AcuteHepatitisBCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(AcuteHepatitisBCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.30')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationTemplateId(AcuteHepatitisBCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(AcuteHepatitisBCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.30')
	 * @param acuteHepatitisBCaseObservation The receiving '<em><b>Acute Hepatitis BCase Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateProblemObservationTemplateId(AcuteHepatitisBCaseObservation acuteHepatitisBCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BCASE_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBCaseObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BCASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProblemObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acuteHepatitisBCaseObservation, context) }),
						 new Object [] { acuteHepatitisBCaseObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // AcuteHepatitisBCaseObservationOperations