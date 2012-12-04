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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Referenced Frames Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation#validateReferencedFramesObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation#validateReferencedFramesObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation#validateReferencedFramesObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation#validateReferencedFramesObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation#validateReferencedFramesObservationBoundaryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Boundary Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation#getBoundaryObservation() <em>Get Boundary Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferencedFramesObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencedFramesObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferencedFramesObservationTemplateId(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationTemplateId(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERENCED_FRAMES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.10')";

	/**
	 * The cached OCL invariant for the '{@link #validateReferencedFramesObservationTemplateId(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationTemplateId(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REFERENCED_FRAMES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referencedFramesObservation The receiving '<em><b>Referenced Frames Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReferencedFramesObservationTemplateId(
			ReferencedFramesObservation referencedFramesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_REFERENCED_FRAMES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERENCED_FRAMES_OBSERVATION);
			try {
				VALIDATE_REFERENCED_FRAMES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REFERENCED_FRAMES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REFERENCED_FRAMES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(referencedFramesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REFERENCED_FRAMES_OBSERVATION__REFERENCED_FRAMES_OBSERVATION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("ReferencedFramesObservationTemplateId"),
						 new Object [] { referencedFramesObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferencedFramesObservationClassCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationClassCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERENCED_FRAMES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::ROIBND";

	/**
	 * The cached OCL invariant for the '{@link #validateReferencedFramesObservationClassCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationClassCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REFERENCED_FRAMES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referencedFramesObservation The receiving '<em><b>Referenced Frames Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReferencedFramesObservationClassCode(
			ReferencedFramesObservation referencedFramesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_REFERENCED_FRAMES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERENCED_FRAMES_OBSERVATION);
			try {
				VALIDATE_REFERENCED_FRAMES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REFERENCED_FRAMES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REFERENCED_FRAMES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(referencedFramesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REFERENCED_FRAMES_OBSERVATION__REFERENCED_FRAMES_OBSERVATION_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("ReferencedFramesObservationClassCode"),
						 new Object [] { referencedFramesObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referencedFramesObservation The receiving '<em><b>Referenced Frames Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReferencedFramesObservationCode(
			ReferencedFramesObservation referencedFramesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_REFERENCED_FRAMES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERENCED_FRAMES_OBSERVATION);
			try {
				VALIDATE_REFERENCED_FRAMES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REFERENCED_FRAMES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REFERENCED_FRAMES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(referencedFramesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REFERENCED_FRAMES_OBSERVATION__REFERENCED_FRAMES_OBSERVATION_CODE,
						 ConsolPlugin.INSTANCE.getString("ReferencedFramesObservationCode"),
						 new Object [] { referencedFramesObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferencedFramesObservationMoodCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationMoodCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERENCED_FRAMES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateReferencedFramesObservationMoodCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationMoodCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REFERENCED_FRAMES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateReferencedFramesObservationCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERENCED_FRAMES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '121190' and value.codeSystem = '1.2.840.10008.2.16.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateReferencedFramesObservationCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationCode(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REFERENCED_FRAMES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referencedFramesObservation The receiving '<em><b>Referenced Frames Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReferencedFramesObservationMoodCode(
			ReferencedFramesObservation referencedFramesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_REFERENCED_FRAMES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERENCED_FRAMES_OBSERVATION);
			try {
				VALIDATE_REFERENCED_FRAMES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REFERENCED_FRAMES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REFERENCED_FRAMES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(referencedFramesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REFERENCED_FRAMES_OBSERVATION__REFERENCED_FRAMES_OBSERVATION_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("ReferencedFramesObservationMoodCode"),
						 new Object [] { referencedFramesObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferencedFramesObservationBoundaryObservation(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Boundary Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationBoundaryObservation(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERENCED_FRAMES_OBSERVATION_BOUNDARY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::BoundaryObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateReferencedFramesObservationBoundaryObservation(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referenced Frames Observation Boundary Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferencedFramesObservationBoundaryObservation(ReferencedFramesObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REFERENCED_FRAMES_OBSERVATION_BOUNDARY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param referencedFramesObservation The receiving '<em><b>Referenced Frames Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReferencedFramesObservationBoundaryObservation(
			ReferencedFramesObservation referencedFramesObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_REFERENCED_FRAMES_OBSERVATION_BOUNDARY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERENCED_FRAMES_OBSERVATION);
			try {
				VALIDATE_REFERENCED_FRAMES_OBSERVATION_BOUNDARY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REFERENCED_FRAMES_OBSERVATION_BOUNDARY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REFERENCED_FRAMES_OBSERVATION_BOUNDARY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(referencedFramesObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REFERENCED_FRAMES_OBSERVATION__REFERENCED_FRAMES_OBSERVATION_BOUNDARY_OBSERVATION,
						 ConsolPlugin.INSTANCE.getString("ReferencedFramesObservationBoundaryObservation"),
						 new Object [] { referencedFramesObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getBoundaryObservation(ReferencedFramesObservation) <em>Get Boundary Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryObservation(ReferencedFramesObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BOUNDARY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::BoundaryObservation))->asSequence()->any(true).oclAsType(consol::BoundaryObservation)";

	/**
	 * The cached OCL query for the '{@link #getBoundaryObservation(ReferencedFramesObservation) <em>Get Boundary Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryObservation(ReferencedFramesObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BOUNDARY_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BoundaryObservation getBoundaryObservation(ReferencedFramesObservation referencedFramesObservation) {
		if (GET_BOUNDARY_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.REFERENCED_FRAMES_OBSERVATION, ConsolPackage.Literals.REFERENCED_FRAMES_OBSERVATION.getEAllOperations().get(56));
			try {
				GET_BOUNDARY_OBSERVATION__EOCL_QRY = helper.createQuery(GET_BOUNDARY_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_BOUNDARY_OBSERVATION__EOCL_QRY);
		return (BoundaryObservation) query.evaluate(referencedFramesObservation);
	}

} // ReferencedFramesObservationOperations
