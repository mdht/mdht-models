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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemObservationOperations;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.util.HepbValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Viral Hepatitis History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation#validateViralHepatitisHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Viral Hepatitis History Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation#validateViralHepatitisHistoryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Viral Hepatitis History Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation#validateViralHepatitisHistoryObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Viral Hepatitis History Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViralHepatitisHistoryObservationOperations extends ProblemObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViralHepatitisHistoryObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViralHepatitisHistoryObservationCode(ViralHepatitisHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Viral Hepatitis History Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateViralHepatitisHistoryObservationCode(ViralHepatitisHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

  /**
	 * The cached OCL invariant for the '{@link #validateViralHepatitisHistoryObservationCode(ViralHepatitisHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Viral Hepatitis History Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateViralHepatitisHistoryObservationCode(ViralHepatitisHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')
	 * @param viralHepatitisHistoryObservation The receiving '<em><b>Viral Hepatitis History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateViralHepatitisHistoryObservationCode(ViralHepatitisHistoryObservation viralHepatitisHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.VIRAL_HEPATITIS_HISTORY_OBSERVATION);
			try {
				VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viralHepatitisHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.VIRAL_HEPATITIS_HISTORY_OBSERVATION__VIRAL_HEPATITIS_HISTORY_OBSERVATION_CODE,
						 HepbPlugin.INSTANCE.getString("ViralHepatitisHistoryObservationCode"),
						 new Object [] { viralHepatitisHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateViralHepatitisHistoryObservationValue(ViralHepatitisHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Viral Hepatitis History Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateViralHepatitisHistoryObservationValue(ViralHepatitisHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateViralHepatitisHistoryObservationValue(ViralHepatitisHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Viral Hepatitis History Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateViralHepatitisHistoryObservationValue(ViralHepatitisHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))
	 * @param viralHepatitisHistoryObservation The receiving '<em><b>Viral Hepatitis History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateViralHepatitisHistoryObservationValue(ViralHepatitisHistoryObservation viralHepatitisHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.VIRAL_HEPATITIS_HISTORY_OBSERVATION);
			try {
				VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viralHepatitisHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.VIRAL_HEPATITIS_HISTORY_OBSERVATION__VIRAL_HEPATITIS_HISTORY_OBSERVATION_VALUE,
						 HepbPlugin.INSTANCE.getString("ViralHepatitisHistoryObservationValue"),
						 new Object [] { viralHepatitisHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViralHepatitisHistoryObservationId(ViralHepatitisHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Viral Hepatitis History Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateViralHepatitisHistoryObservationId(ViralHepatitisHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateViralHepatitisHistoryObservationId(ViralHepatitisHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Viral Hepatitis History Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateViralHepatitisHistoryObservationId(ViralHepatitisHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param viralHepatitisHistoryObservation The receiving '<em><b>Viral Hepatitis History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateViralHepatitisHistoryObservationId(ViralHepatitisHistoryObservation viralHepatitisHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.VIRAL_HEPATITIS_HISTORY_OBSERVATION);
			try {
				VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viralHepatitisHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.VIRAL_HEPATITIS_HISTORY_OBSERVATION__VIRAL_HEPATITIS_HISTORY_OBSERVATION_ID,
						 HepbPlugin.INSTANCE.getString("ViralHepatitisHistoryObservationId"),
						 new Object [] { viralHepatitisHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationTemplateId(ViralHepatitisHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(ViralHepatitisHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.32')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationTemplateId(ViralHepatitisHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(ViralHepatitisHistoryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.32')
	 * @param viralHepatitisHistoryObservation The receiving '<em><b>Viral Hepatitis History Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateProblemObservationTemplateId(ViralHepatitisHistoryObservation viralHepatitisHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.VIRAL_HEPATITIS_HISTORY_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viralHepatitisHistoryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.VIRAL_HEPATITIS_HISTORY_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProblemObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(viralHepatitisHistoryObservation, context) }),
						 new Object [] { viralHepatitisHistoryObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // ViralHepatitisHistoryObservationOperations