/**
 */
package org.openhealthtools.mdht.uml.cda.clondata;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounters Section BCTPS</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage#getEncountersSectionBCTPS()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Encounters Section BCTPS'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Encounters Section BCTPSTemplateId Encounters Section BCTPSHospitalization With Reason' templateId.root='2.16.840.1.113883.10.20.30.2.9'"
 * @generated
 */
public interface EncountersSectionBCTPS extends EncountersSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Encounters Section BCTPSHospitalization With Reason'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(clondata::HospitalizationWithReason))'"
	 * @generated
	 */
	boolean validateEncountersSectionBCTPSHospitalizationWithReason(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getHospitalization With Reason'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(clondata::HospitalizationWithReason))->asSequence()->any(true).oclAsType(clondata::HospitalizationWithReason)'"
	 * @generated
	 */
	HospitalizationWithReason getHospitalizationWithReason();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSectionBCTPS init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSectionBCTPS init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EncountersSectionBCTPS
