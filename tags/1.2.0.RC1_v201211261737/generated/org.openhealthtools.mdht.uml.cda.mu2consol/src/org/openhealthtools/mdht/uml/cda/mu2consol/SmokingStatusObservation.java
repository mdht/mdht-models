/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.TobaccoUse;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Smoking Status Observation</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getSmokingStatusObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SmokingStatusObservationTemplateId SmokingStatusObservationValue SmokingStatusObservationValueP' templateId.root='2.16.840.1.113883.10.20.22.4.78' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' constraints.validation.dependOn.SmokingStatusObservationValue='SmokingStatusObservationValueP'"
 * @generated
 */
public interface SmokingStatusObservation extends TobaccoUse {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element |
	 * element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())'"
	 * @generated
	 */
	boolean validateSmokingStatusObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element |
	 * element.isNullFlavorUndefined())) implies (self.value->size() = 1 and
	 * self.value->forAll(element | not element.oclIsUndefined() and
	 * element.oclIsKindOf(datatypes::CD) and let value : datatypes::CD =
	 * element.oclAsType(datatypes::CD) in value.codeSystem =
	 * '2.16.840.1.113883.6.96' and (value.code = '449868002' or value.code =
	 * '428041000124106' or value.code = '8517006' or value.code = '266919005'
	 * or value.code = '77176002' or value.code = '266927001' or value.code =
	 * '428071000124103' or value.code = '428061000124105')))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'449868002\' or value.code = \'428041000124106\' or value.code = \'8517006\' or value.code = \'266919005\' or value.code = \'77176002\' or value.code = \'266927001\' or value.code = \'428071000124103\' or value.code = \'428061000124105\')))'"
	 * @generated
	 */
	boolean validateSmokingStatusObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public SmokingStatusObservation init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public SmokingStatusObservation init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // SmokingStatusObservation
