/**
 * Copyright (C) 2009, OFFIS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * This software and supporting documentation were developed by
 * 
 *   OFFIS e.V.
 *   Escherweg 2, 26121 Oldenburg
 *  
 * THIS SOFTWARE IS MADE AVAILABLE,  AS IS,  AND OFFIS 
 * MAKES NO  WARRANTY REGARDING  THE  SOFTWARE,  ITS  PERFORMANCE,  ITS  
 * MERCHANTABILITY  OR FITNESS FOR ANY PARTICULAR USE, FREEDOM FROM ANY 
 * COMPUTER DISEASES  OR ITS CONFORMITY TO ANY SPECIFICATION. THE ENTIRE RISK 
 * AS TO QUALITY AND PERFORMANCE OF THE SOFTWARE IS WITH THE USER.
 *  
 * Author:  "Myriam Lipprandt <myriam.lipprandt@offis.de>", OFFIS e.V.
 * Date: 2011-12-14
 * 
 */
package org.openhealthtools.mdht.uml.cda.phmr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPlugin;
import org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation;
import org.openhealthtools.mdht.uml.cda.phmr.util.PhmrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Waveform Series Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#validateWaveformSeriesObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#validateWaveformSeriesObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#validateWaveformSeriesObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#validateWaveformSeriesObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#validateWaveformSeriesObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#validateWaveformSeriesObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#validateWaveformSeriesObservationPHMRProductInstanceReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation PHMR Product Instance Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#validateWaveformSeriesObservationObservationMediaJPG(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Observation Media JPG</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#validateWaveformSeriesObservationObservationNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Observation Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#getObservationMediaJPG() <em>Get Observation Media JPG</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#getObservationNullFlavor() <em>Get Observation Null Flavor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WaveformSeriesObservationOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
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
	protected WaveformSeriesObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWaveformSeriesObservationTemplateId(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSeriesObservationTemplateId(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WAVEFORM_SERIES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.9.12')";

	/**
	 * The cached OCL invariant for the '{@link #validateWaveformSeriesObservationTemplateId(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSeriesObservationTemplateId(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_WAVEFORM_SERIES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param waveformSeriesObservation The receiving '<em><b>Waveform Series Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateWaveformSeriesObservationTemplateId(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_WAVEFORM_SERIES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(PhmrPackage.Literals.WAVEFORM_SERIES_OBSERVATION);
			try {
				VALIDATE_WAVEFORM_SERIES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WAVEFORM_SERIES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WAVEFORM_SERIES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(waveformSeriesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.WAVEFORM_SERIES_OBSERVATION__WAVEFORM_SERIES_OBSERVATION_TEMPLATE_ID,
						 PhmrPlugin.INSTANCE.getString("WaveformSeriesObservationWaveformSeriesObservationTemplateId"),
						 new Object [] { waveformSeriesObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWaveformSeriesObservationClassCode(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSeriesObservationClassCode(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WAVEFORM_SERIES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBSSER";

	/**
	 * The cached OCL invariant for the '{@link #validateWaveformSeriesObservationClassCode(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSeriesObservationClassCode(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_WAVEFORM_SERIES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param waveformSeriesObservation The receiving '<em><b>Waveform Series Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateWaveformSeriesObservationClassCode(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_WAVEFORM_SERIES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(PhmrPackage.Literals.WAVEFORM_SERIES_OBSERVATION);
			try {
				VALIDATE_WAVEFORM_SERIES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WAVEFORM_SERIES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WAVEFORM_SERIES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(waveformSeriesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.WAVEFORM_SERIES_OBSERVATION__WAVEFORM_SERIES_OBSERVATION_CLASS_CODE,
						 PhmrPlugin.INSTANCE.getString("WaveformSeriesObservationWaveformSeriesObservationClassCode"),
						 new Object [] { waveformSeriesObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWaveformSeriesObservationCodeP(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateWaveformSeriesObservationCodeP(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_WAVEFORM_SERIES_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateWaveformSeriesObservationCodeP(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateWaveformSeriesObservationCodeP(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_WAVEFORM_SERIES_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param waveformSeriesObservation The receiving '<em><b>Waveform Series Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateWaveformSeriesObservationCodeP(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_WAVEFORM_SERIES_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(PhmrPackage.Literals.WAVEFORM_SERIES_OBSERVATION);
			try {
				VALIDATE_WAVEFORM_SERIES_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WAVEFORM_SERIES_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WAVEFORM_SERIES_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(waveformSeriesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.WAVEFORM_SERIES_OBSERVATION__WAVEFORM_SERIES_OBSERVATION_CODE_P,
						 PhmrPlugin.INSTANCE.getString("WaveformSeriesObservationWaveformSeriesObservationCodeP"),
						 new Object [] { waveformSeriesObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservationCodeP", passToken);
				}
				passToken.add(waveformSeriesObservation);
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateWaveformSeriesObservationCode(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSeriesObservationCode(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WAVEFORM_SERIES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateWaveformSeriesObservationCode(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSeriesObservationCode(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_WAVEFORM_SERIES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param waveformSeriesObservation The receiving '<em><b>Waveform Series Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateWaveformSeriesObservationCode(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(waveformSeriesObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_WAVEFORM_SERIES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(PhmrPackage.Literals.WAVEFORM_SERIES_OBSERVATION);
			try {
				VALIDATE_WAVEFORM_SERIES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WAVEFORM_SERIES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WAVEFORM_SERIES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(waveformSeriesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.WAVEFORM_SERIES_OBSERVATION__WAVEFORM_SERIES_OBSERVATION_CODE,
						 PhmrPlugin.INSTANCE.getString("WaveformSeriesObservationWaveformSeriesObservationCode"),
						 new Object [] { waveformSeriesObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWaveformSeriesObservationEffectiveTime(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSeriesObservationEffectiveTime(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WAVEFORM_SERIES_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateWaveformSeriesObservationEffectiveTime(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSeriesObservationEffectiveTime(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_WAVEFORM_SERIES_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param waveformSeriesObservation The receiving '<em><b>Waveform Series Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateWaveformSeriesObservationEffectiveTime(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_WAVEFORM_SERIES_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(PhmrPackage.Literals.WAVEFORM_SERIES_OBSERVATION);
			try {
				VALIDATE_WAVEFORM_SERIES_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WAVEFORM_SERIES_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WAVEFORM_SERIES_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(waveformSeriesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.WAVEFORM_SERIES_OBSERVATION__WAVEFORM_SERIES_OBSERVATION_EFFECTIVE_TIME,
						 PhmrPlugin.INSTANCE.getString("WaveformSeriesObservationWaveformSeriesObservationEffectiveTime"),
						 new Object [] { waveformSeriesObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWaveformSeriesObservationMoodCode(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSeriesObservationMoodCode(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WAVEFORM_SERIES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateWaveformSeriesObservationMoodCode(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSeriesObservationMoodCode(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_WAVEFORM_SERIES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param waveformSeriesObservation The receiving '<em><b>Waveform Series Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateWaveformSeriesObservationMoodCode(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_WAVEFORM_SERIES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(PhmrPackage.Literals.WAVEFORM_SERIES_OBSERVATION);
			try {
				VALIDATE_WAVEFORM_SERIES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WAVEFORM_SERIES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WAVEFORM_SERIES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(waveformSeriesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.WAVEFORM_SERIES_OBSERVATION__WAVEFORM_SERIES_OBSERVATION_MOOD_CODE,
						 PhmrPlugin.INSTANCE.getString("WaveformSeriesObservationWaveformSeriesObservationMoodCode"),
						 new Object [] { waveformSeriesObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWaveformSeriesObservationPHMRProductInstanceReference(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation PHMR Product Instance Reference</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateWaveformSeriesObservationPHMRProductInstanceReference(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_WAVEFORM_SERIES_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

  /**
	 * The cached OCL invariant for the '{@link #validateWaveformSeriesObservationPHMRProductInstanceReference(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation PHMR Product Instance Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateWaveformSeriesObservationPHMRProductInstanceReference(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_WAVEFORM_SERIES_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param waveformSeriesObservation The receiving '<em><b>Waveform Series Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateWaveformSeriesObservationPHMRProductInstanceReference(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_WAVEFORM_SERIES_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(PhmrPackage.Literals.WAVEFORM_SERIES_OBSERVATION);
			try {
				VALIDATE_WAVEFORM_SERIES_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WAVEFORM_SERIES_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WAVEFORM_SERIES_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(waveformSeriesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.WAVEFORM_SERIES_OBSERVATION__WAVEFORM_SERIES_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE,
						 PhmrPlugin.INSTANCE.getString("WaveformSeriesObservationWaveformSeriesObservationPHMRProductInstanceReference"),
						 new Object [] { waveformSeriesObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateWaveformSeriesObservationObservationMediaJPG(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Observation Media JPG</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSeriesObservationObservationMediaJPG(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WAVEFORM_SERIES_OBSERVATION_OBSERVATION_MEDIA_JPG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observationMedia.oclIsUndefined() and entryRelationship.observationMedia.oclIsKindOf(cda::ObservationMedia))";

	/**
	 * The cached OCL invariant for the '{@link #validateWaveformSeriesObservationObservationMediaJPG(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Observation Media JPG</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSeriesObservationObservationMediaJPG(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_WAVEFORM_SERIES_OBSERVATION_OBSERVATION_MEDIA_JPG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param waveformSeriesObservation The receiving '<em><b>Waveform Series Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateWaveformSeriesObservationObservationMediaJPG(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_WAVEFORM_SERIES_OBSERVATION_OBSERVATION_MEDIA_JPG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(PhmrPackage.Literals.WAVEFORM_SERIES_OBSERVATION);
			try {
				VALIDATE_WAVEFORM_SERIES_OBSERVATION_OBSERVATION_MEDIA_JPG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WAVEFORM_SERIES_OBSERVATION_OBSERVATION_MEDIA_JPG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WAVEFORM_SERIES_OBSERVATION_OBSERVATION_MEDIA_JPG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(waveformSeriesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.WAVEFORM_SERIES_OBSERVATION__WAVEFORM_SERIES_OBSERVATION_OBSERVATION_MEDIA_JPG,
						 PhmrPlugin.INSTANCE.getString("WaveformSeriesObservationWaveformSeriesObservationObservationMediaJPG"),
						 new Object [] { waveformSeriesObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWaveformSeriesObservationObservationNullFlavor(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Observation Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSeriesObservationObservationNullFlavor(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WAVEFORM_SERIES_OBSERVATION_OBSERVATION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(cda::Observation))";

	/**
	 * The cached OCL invariant for the '{@link #validateWaveformSeriesObservationObservationNullFlavor(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Observation Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWaveformSeriesObservationObservationNullFlavor(WaveformSeriesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_WAVEFORM_SERIES_OBSERVATION_OBSERVATION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param waveformSeriesObservation The receiving '<em><b>Waveform Series Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateWaveformSeriesObservationObservationNullFlavor(WaveformSeriesObservation waveformSeriesObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_WAVEFORM_SERIES_OBSERVATION_OBSERVATION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(PhmrPackage.Literals.WAVEFORM_SERIES_OBSERVATION);
			try {
				VALIDATE_WAVEFORM_SERIES_OBSERVATION_OBSERVATION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WAVEFORM_SERIES_OBSERVATION_OBSERVATION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WAVEFORM_SERIES_OBSERVATION_OBSERVATION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(waveformSeriesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.WAVEFORM_SERIES_OBSERVATION__WAVEFORM_SERIES_OBSERVATION_OBSERVATION_NULL_FLAVOR,
						 PhmrPlugin.INSTANCE.getString("WaveformSeriesObservationWaveformSeriesObservationObservationNullFlavor"),
						 new Object [] { waveformSeriesObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getObservationMediaJPG(WaveformSeriesObservation) <em>Get Observation Media JPG</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationMediaJPG(WaveformSeriesObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OBSERVATION_MEDIA_JPG__EOCL_EXP = "self.getObservationMedia()->select(observationMedia : cda::ObservationMedia | not observationMedia.oclIsUndefined() and observationMedia.oclIsKindOf(cda::ObservationMedia))->asSequence()->any(true).oclAsType(cda::ObservationMedia)";

	/**
	 * The cached OCL query for the '{@link #getObservationMediaJPG(WaveformSeriesObservation) <em>Get Observation Media JPG</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationMediaJPG(WaveformSeriesObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OBSERVATION_MEDIA_JPG__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  org.eclipse.mdht.uml.cda.ObservationMedia getObservationMediaJPG(WaveformSeriesObservation waveformSeriesObservation) {
	
	
	
		if (GET_OBSERVATION_MEDIA_JPG__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(PhmrPackage.Literals.WAVEFORM_SERIES_OBSERVATION, PhmrPackage.Literals.WAVEFORM_SERIES_OBSERVATION.getEAllOperations().get(60));
			try {
				GET_OBSERVATION_MEDIA_JPG__EOCL_QRY = helper.createQuery(GET_OBSERVATION_MEDIA_JPG__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_OBSERVATION_MEDIA_JPG__EOCL_QRY);
		return (org.eclipse.mdht.uml.cda.ObservationMedia) query.evaluate(waveformSeriesObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getObservationNullFlavor(WaveformSeriesObservation) <em>Get Observation Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationNullFlavor(WaveformSeriesObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OBSERVATION_NULL_FLAVOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation))->asSequence()->any(true).oclAsType(cda::Observation)";

	/**
	 * The cached OCL query for the '{@link #getObservationNullFlavor(WaveformSeriesObservation) <em>Get Observation Null Flavor</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationNullFlavor(WaveformSeriesObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OBSERVATION_NULL_FLAVOR__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  org.eclipse.mdht.uml.cda.Observation getObservationNullFlavor(WaveformSeriesObservation waveformSeriesObservation) {
	
	
	
		if (GET_OBSERVATION_NULL_FLAVOR__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(PhmrPackage.Literals.WAVEFORM_SERIES_OBSERVATION, PhmrPackage.Literals.WAVEFORM_SERIES_OBSERVATION.getEAllOperations().get(61));
			try {
				GET_OBSERVATION_NULL_FLAVOR__EOCL_QRY = helper.createQuery(GET_OBSERVATION_NULL_FLAVOR__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_OBSERVATION_NULL_FLAVOR__EOCL_QRY);
		return (org.eclipse.mdht.uml.cda.Observation) query.evaluate(waveformSeriesObservation);
	}

} // WaveformSeriesObservationOperations